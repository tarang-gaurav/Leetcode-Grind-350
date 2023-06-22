package BackTracking;
import java.util.*;

public class PermuationOfArray {
    
    private static void getAllPermutations(List<Integer>curr,List<List<Integer>>res,int[] arr){

        if(curr.size()==arr.length){
            res.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(!curr.contains(arr[i])){
                curr.add(arr[i]);
                getAllPermutations(curr,res,arr);
                curr.remove(curr.size()-1);
            }
        }
        

}

public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>curr=new ArrayList<>();
    getAllPermutations(curr,res,nums);
    return res;
}

public static void main(String[]agrs){
    PermuationOfArray p=new PermuationOfArray();
    List<List<Integer>>res= p.permute(new int[]{1,2,3});
}

}
