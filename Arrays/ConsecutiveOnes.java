public class ConsecutiveOnes {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int max=0,count=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                count++;     
            }
            else{
                count=0;
            }

            max = Math.max(max, count);
        }
      
      return max;
      
    }

    public static void main(String[] args){
        ConsecutiveOnes m=new ConsecutiveOnes();
        int r=m.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println(r);
    } 

}
