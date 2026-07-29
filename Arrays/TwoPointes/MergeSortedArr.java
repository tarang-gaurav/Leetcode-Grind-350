package TwoPointes;

import java.util.Arrays;

public class MergeSortedArr {

     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // defining var
        int last = (m+n)-1;
        int p1 = m-1;
        int p2 = n-1;
        while(p2>=0 && p1>=0){
            if(nums1[p1]<nums2[p2]){
                nums1[last]=nums2[p2];
                p2--;
            }
            else{
                nums1[last] = nums1[p1];
                p1--;
            }
            last-=1;
        }

        while(p2>=0){
            nums1[last]=nums2[p2];
            last--;
            p2--;
        }

        Arrays.stream(nums1).forEach(System.out::print);
        
    }


    public static void main(String[] args) {
        MergeSortedArr m = new MergeSortedArr();
        m.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}
