public class MoveZeroesToEnd {
    //1,3,5,0,0,2
    //Use Array in-place , dont use new array
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<n){
            nums[count++]=0;
        }
    }

    public static void main (String [] args){
        MoveZeroesToEnd m =new MoveZeroesToEnd();

    }
}
