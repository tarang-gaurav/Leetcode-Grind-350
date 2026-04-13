package BinarySearch;

import java.util.Arrays;

public class Koko {


    boolean canEatPile(int mid , int[] arr , int h){
        int totalTime=0;
        for(int i=0 ; i<arr.length ; i++){
            totalTime += (int)Math.ceil((double)arr[i]/mid);
           
        }
         if(totalTime<=h){
                return true;
            }
        return false;
    }


   public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 0;
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canEatPile(mid, piles, h)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Koko k = new Koko();
        System.out.println(k.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
}
