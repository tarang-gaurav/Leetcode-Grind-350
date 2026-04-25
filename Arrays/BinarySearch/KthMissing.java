package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthMissing {
    
    public int findKthPositive(int[] arr, int k) {
        
        int low = 0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-(mid+1)<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low+k;

    }
    
    public static void main(String[] args) {
        KthMissing k = new KthMissing();
        System.out.println(k.findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}
