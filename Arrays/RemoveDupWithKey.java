class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            nums[count]=nums[i];
            count++;
        }
        return count;
    }


    public static void main(String[]args){
        Solution s=new Solution();
        int[] arr={1,2,3,3,3,4,2,3};
        int key=3;
        System.out.print(s.removeElement(arr,key));
    }
}