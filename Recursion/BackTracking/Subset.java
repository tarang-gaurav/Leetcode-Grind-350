package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    
    private void  getSol(int[] arr,int n,int index,List<Integer>temp,
        List<List<Integer>>res){
        
        if(index>=n){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[index]);
        getSol(arr,n,index+1,temp,res);
        temp.remove(temp.size()-1);
        getSol(arr,n,index+1,temp,res);
    }

     public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>>res=new ArrayList<>();
            List<Integer>temp=new ArrayList<>();
            getSol(nums, nums.length, 0, temp,res);
            return res;
    }

    public static void main(String[] args) {
        Subset s= new Subset();
        s.subsets(new int[]{1,2,3});
        
    }

}
