package TwoPointes;

public class ContainerMostWater {

    public int maxArea(int[] arr) {
        
        int max  = 0;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){

                int minLen = Math.min(arr[i],arr[j]);
                int width = j-i;
                max = Math.max(minLen * width,max);
            }
        }
        return max;
    }

    public int maxAreaOptimal(int[] arr) {
        
        int max  = 0;
        // width will always be shrinking because the width max would be sizeOfArray - 1
        // wherever height is low we have to move from there in order to find possible max height
        int l = 0,r=arr.length-1;

        while(l<r){

            int width = (r-l);
            int vol = width * Math.min(arr[l],arr[r]);
            max = Math.max(vol,max);

            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        ContainerMostWater c  =  new ContainerMostWater();
        System.out.print(c.maxAreaOptimal(new int[]{1,1}));
    }
}
