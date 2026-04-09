package BinarySearch;

public class FindPeakElem {


    boolean checkPeakElem(int[] nums , int mid){

        if(nums[mid]>nums[mid+1] && nums[mid-1]<nums[mid]){
            return true;
        }
        return false;

    }

    int findPeak(int[] nums){
        if(nums.length==1) return 0;

        if(nums.length==2){
           if(nums[0]>nums[1]){
            return 0;
           }
           else {
            return 1;
           }
        }
        int len = nums.length;
        int low = 1 , high = nums.length-2;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(checkPeakElem(nums , mid)){
                return mid;
            }
            else{
                if(nums[mid] < nums[mid+1]){
                    low = mid +1;
                }
                else if(nums[mid]<nums[mid-1]){
                    high = mid-1;
                }
            }
        }
        // Edge case
        if(nums[0]>nums[1]) return 0;
        if(nums[len-1]>nums[len-2]) return len-1; 
    }

    public static void main(String[] args) {
      FindPeakElem f = new FindPeakElem();
      System.out.println(f.findPeak(new int[]{1,2,1,3,5,6,4}));  
    }
}
