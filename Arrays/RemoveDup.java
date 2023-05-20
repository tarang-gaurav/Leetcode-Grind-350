class Solution {
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
        for(Integer i:nums)
            System.out.print(i+" ");
        return count;
    }

    public static void main(String[] args){
        Solution s=new Solution();
        int[] arr={0,1,1,2,2,2,2,3};
        System.out.println(s.removeDuplicates(arr));
    }

}

