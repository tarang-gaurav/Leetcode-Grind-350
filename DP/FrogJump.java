package DP;
import java.util.*;


public class FrogJump {

//Using Tabulation    
private static int findJumpDP(int[] height,int[] dp){
    
    dp[0]=0;
    int jump2=Integer.MAX_VALUE;
    
    for(int i=1;i<height.length;i++){
        int jump1=dp[i-1]+Math.abs(height[i]-height[i-1]);
        if(i>1)
            jump2=dp[i-2]+Math.abs(height[i]-height[i-2]);
        dp[i]=Math.min(jump2,jump1);
    }

    return dp[height.length-1];
}

//Using Memorization    
private static int findJump(int i,int[] height,int[] dp){
    
    dp[0]=0;
    if(dp[i]!=-1) return dp[i];
    int jump=Integer.MAX_VALUE;
    
        int jump1=findJump(i-1,height,dp)+Math.abs(height[i]-height[i-1]);
        if(i>1)
            jump=findJump(i-2,height,dp)+Math.abs(height[i]-height[i-2]);

    
    return dp[i]=Math.min(jump,jump1);
}

    public static void main(String[] args) {
        int[] dp=new int[6];
        Arrays.fill(dp,-1);
       // int ans=findJumpDP(5,new int[]{30,10,60,10,60,50},dp);

        int ans=findJumpDP(new int[]{30,10,60,10,60,50},dp);
        System.out.println(ans);
    }
}
