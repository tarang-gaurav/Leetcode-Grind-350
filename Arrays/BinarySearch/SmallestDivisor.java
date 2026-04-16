package BinarySearch;

import java.util.Arrays;

public class SmallestDivisor {
      private boolean isDivisorPossible(int[] arr,int mid,int thresh){
        long sum = 0;
        for(int i : arr){
            double x = (double)i/mid;
            double ceil = Math.ceil(x);
            long doubleCeil = (long)ceil;
            sum = sum + doubleCeil;
        }
        return (sum<=thresh);

    }
    
    public int smallestDivisor(int[] arr, int threshold) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans  = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isDivisorPossible(arr, mid, threshold)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SmallestDivisor s = new SmallestDivisor();
        System.out.println(s.smallestDivisor(new int[]{1,2,5,9},6));
    }
}
