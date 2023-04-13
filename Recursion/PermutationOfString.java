import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfString {


    public static ArrayList<String> sequence(String s, String temp, int index,ArrayList<String>res){
        if (s.length()==index){ 
                  //Base Case
                  res.add(temp);
            return res;
        }
    
        // take
        //String X = temp.concat(String.valueOf(s.charAt(index)));
       
       sequence(s,temp+s.charAt(index),index+1,res);
       
   
        // not take
       sequence(s,temp,index+1,res);
   
     return res;
        }

   void calculateAllSets(String str,int n,int index,String curr){
        ArrayList<String>resList=new ArrayList<>();
        if(n==index){
        
            return ;
        }
           
       
            resList.add(curr);
            for(int i=index+1;i<n;i++){
                curr=curr+str.charAt(i);
                calculateAllSets(str, n, index, curr);
                curr=curr.substring(0,curr.length()-1);
            }
           
       


    }
    ArrayList<String> powerSet(String str){
        char[]chArr=str.toCharArray();
       // Arrays.sort(chArr);
       ArrayList<String>res=new ArrayList<>();
       return  sequence(str,"",0,res);
       // calculateAllSets(new String(chArr),str.length(),-1,"");

    }


    public static void main(String[]args){
        PermutationOfString p=new PermutationOfString();
        System.out.println(p.powerSet("abc"));
    }
}
