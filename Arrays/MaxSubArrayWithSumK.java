import java.util.*;
public class MaxSubArrayWithSumK {
    

    ///Using hashinh and calculating prefix sum
    public int lenOfLongSubArr(int a[],int N,int k){
        Map<Long,Integer>prefixSum=new HashMap<>();
         long sum=0L;
         int maxLen=0;
        for(int i=0;i<N;i++){
            
            sum+=a[i];
            
            if(sum==k){
                maxLen=Math.max(maxLen, i+1);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
            if(prefixSum.containsKey(sum-k)){
                int len=i-prefixSum.get(sum-k);
                maxLen=Math.max(maxLen, len);
            }
        }
        

        return maxLen;
    }

    public static void main(String[] args){
        MaxSubArrayWithSumK k=new MaxSubArrayWithSumK();
        System.out.println(k.lenOfLongSubArr(new int[] {10, 5, 2, 7, 1, 9}, 5, 15));
    }
}
