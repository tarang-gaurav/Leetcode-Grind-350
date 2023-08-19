import java.util.HashMap;

public class TwoSum {
    
    
    private int[] getIndexOfPair(int[] nums,int target){
      HashMap<Integer,Integer>res=new HashMap<>();
       
        int[] ans=new int[]{};
        for (int i=0;i<res.size();i++){
            int comp=target-nums[i];
            if(res.containsKey(comp)){
                ans[0]=res.get(comp);
                ans[1]=i;
            }
           
                res.put(nums[i],i);
            
        }
        return ans;
    }


    public static void main(String[] agrs){
        TwoSum t=new TwoSum();
        int[] res=t.getIndexOfPair(new int[]{2,7,11,15}, 9);
        for(int a:res){
            System.out.println(a);
        }
    }
}
