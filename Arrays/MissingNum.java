public class MissingNum {

    public int missingNumber(int[] nums) {
        int len=nums.length;
        int i=0;
        long sumActual=0L,sumExpected=0L;

        while(i<=len){
            sumExpected=sumExpected+i;
            i++;
        }
        for(i=0;i<len;i++){
            sumActual=sumActual+nums[i];
        }
        int res=(int)sumExpected-(int)sumActual;
        return res;
    }

    public static void main(String[] args){
        MissingNum m=new MissingNum();
        int r=m.missingNumber(new int[]{0,3,1});
        System.out.println(r);
    } 
}
