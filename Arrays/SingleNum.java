public class SingleNum {
    public int singleNumber(int[] nums) {
        int x=0;
          for(int i:nums){
              x=x^i;
          }
          return x;
      }
    public static void main(String [] args){
        SingleNum s = new SingleNum();
        s.singleNumber(new int[]{2,2,3,4,4});
        System.out.println(s);
    }
}
