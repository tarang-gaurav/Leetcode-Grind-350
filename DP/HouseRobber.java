package DP;

import java.util.Arrays;

public class HouseRobber {
       /* private int helper(int ind,int[] arr,int[] dp){
        if(ind==0)
            return arr[ind];
        if(ind<0)
            return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick=arr[ind]+helper(ind-2,arr,dp);
        int notPick=helper(ind-1,arr,dp);
        return dp[ind]=Math.max(pick,notPick);
    }**/

    // 1 , 2 , 3 , 1
    private int helper(int n,int[] arr,int[] dp){
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1)
                pick+=dp[i-2];
            int nonPick=dp[i-1];
            dp[i]=Math.max(pick,nonPick);
        }
        return dp[n-1];
    }

     public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums.length,nums,dp);
    }

    public static void main(String[] args) {
        HouseRobber r=new HouseRobber();
        r.rob(new int[]{1,2,3,1});
    }
}
