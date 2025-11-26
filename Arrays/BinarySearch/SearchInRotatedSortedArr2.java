package BinarySearch;

public class SearchInRotatedSortedArr2 {

 public boolean search(int[] nums, int target) {
        
        int low = 0 , high = nums.length - 1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return true;
            if(nums[low] < nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid -1;
                }
                else {
                    low = mid+1;
                }
            }
            else if (nums[low] > nums[mid]){
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else 
                    high = mid -1;
            }
            else{
                low = low + 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        SearchInRotatedSortedArr2 s = new SearchInRotatedSortedArr2();
        System.out.println(s.search(new int[]{7,8,9,3,5,5,5,6}, 5));
    }
}
