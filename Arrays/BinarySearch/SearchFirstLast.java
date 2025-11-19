package BinarySearch;


public class SearchFirstLast {
    
        private int searchBinary(int[] nums , int target){
            
            int low=0;
            int high = nums.length-1;

            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid]<target){
                    low = mid +1;
                }
                else if(nums[mid]>target)
                {
                    high = mid-1;
                }
                else
                    {  
                        return mid;
                    }
            }
            return -1;
        }

        private int[] range(int[] nums, int target){
            if(nums.length==0) return new int[]{-1,-1};
            int lowRange = searchBinary(nums, target);
            if(lowRange == -1){
                return new int[]{-1,-1};
            }
            int prev = lowRange - 1;
            int next = lowRange + 1;
            if(nums[lowRange]== nums[prev])
                return new int[]{lowRange,prev};
            if(nums[lowRange]== nums[next])
                return new int[]{lowRange,next};
            return new int[]{-1,-1};
        }

       public static void main(String[] args) {
        System.out.println("hi binary!!!");
        SearchFirstLast s =  new SearchFirstLast();
        int[] res = s.range(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(res[0] + " ," +res[1] );
    }

}
