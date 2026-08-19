package SlidingWindow;

public class AvgSubarrayK {
    
    public double findMaxAverage(int[] nums, int k) {
    double  win=0;
    double maxAvg=0.00000d;
    double avg=0.00000d;
    // find the window
    for(int i=0;i<k;i++){
        win += nums[i];
    }
    avg = win/k;    
    maxAvg = avg;
    for(int r = k;r<nums.length;r++){
        win += nums[r];
        win -= nums[r-k];
        avg  = win/k;
        maxAvg = Math.max(avg,maxAvg);

    }
    return maxAvg;
    
    }

    public static void main(String[] args){
        AvgSubarrayK a = new AvgSubarrayK();
        System.out.println("Ans : " + a.findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }

}
