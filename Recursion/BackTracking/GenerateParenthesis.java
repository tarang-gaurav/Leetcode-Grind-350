package BackTracking;
import java.util.*;
public class GenerateParenthesis {
    
    private static void computeParenthesis(List<String>res,String curr,int n,int leftC,int rightC){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }

        if(leftC<n){               
            computeParenthesis(res, curr+"(", n, leftC+1, rightC);
         
        }
        if(leftC>rightC){
            computeParenthesis(res, curr+")", n, leftC, rightC+1);
            
        }
}

public List<String> generateParenthesis(int n) {
    List<String>res=new ArrayList<>();
    computeParenthesis(res,"", n, 0, 0);
    return res;

}
}
