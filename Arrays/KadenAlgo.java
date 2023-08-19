class Kaden{

/**
 * Kaden Algo--- Contiguous Sub Array having Max Sum , returning its Sum and SubArray
 * 
 */

    int maxSubarraySum(int[] arr,int n){
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max, sum);

            
        }


        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
         int n =arr.length;
         int maxSum = maxSubarraySum(arr, n);
    }
}