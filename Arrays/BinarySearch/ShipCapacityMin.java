package BinarySearch;

import java.util.Arrays;

public class ShipCapacityMin {

    int maxCapacity(int[] arr){
        return Arrays.stream(arr).sum();
    }

    boolean canShipIn(int[] arr , int mid , int maxDays){
        int capacity = 0;
        int day = 1;
        for(int i : arr){
            if(capacity + i <= mid){
                capacity+=i;
            }else{
                day++;
                capacity = i;
            }
        }
        return (day<=maxDays);

    }

    public int shipWithinDays(int[] weights, int days) {
        
        int low = Arrays.stream(weights).max().getAsInt();
        int high = maxCapacity(weights);
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canShipIn(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }


 public static void main(String[] args) {
    ShipCapacityMin s = new ShipCapacityMin();
    System.out.println(s.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
 }   
}
