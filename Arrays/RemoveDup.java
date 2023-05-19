class Solution {
    /*
    We can use temp Array to store unique elements or array in place but it will only work when array is sorted
    In case of unsorted array we need to use hasSet and to maintain the order we can use linkedHashSet for insertion order or TreeSet to generic order 
    or we can use count hash Array or hashMap too to record the count and then manipulate original array.
    
    */
    
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue; 
                       }
            ///updating sorted array in-place
            nums[count]=nums[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Solution s=new Solution();
        int[] arr={0,1,1,2,2,2,2,3};
        s.removeDuplicates(arr);
    }

}

