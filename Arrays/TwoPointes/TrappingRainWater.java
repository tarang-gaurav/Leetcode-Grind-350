package TwoPointes;

public class TrappingRainWater {

    private int getTrappedTotalWater(int[] arr){
        int len = arr.length;
       
        // get prefix sum
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        suffix[len-1]=arr[len-1];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++)
            prefix[i]=Math.max(prefix[i-1],arr[i]);

        // suffix sum
        for(int i=len-2;i>=0;i--)
            suffix[i]=Math.max(suffix[i+1],arr[i]);

        int sum=0;
        for(int i=0;i<len;i++){
            int water=Math.min(prefix[i],suffix[i]) -arr[i];
            sum+=water;
        }

        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWater t = new TrappingRainWater();
        System.out.println(t.getTrappedTotalWater(new int[]{4,2,0,3,2,5}));
    }
}
