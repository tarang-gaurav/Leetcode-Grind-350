package BinarySearch;

public class FindMinInRotated {

     public int findMin(int[] nums) {
        
        int low=0 ,high = nums.length-1;
        //int ans = Integer.MAX_VALUE;;

        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    
    }
 
    public static void main(String[] args) {
        FindMinInRotated f = new FindMinInRotated();
        System.out.println(f.findMin(new int[]{2,3,4,5,1}));//4,5,6,7,0,1,2
    }
}
