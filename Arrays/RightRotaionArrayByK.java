public class RightRotaionArrayByK {
    


 /*    public void rotateByReverse(int[] arr,int d){
        int n=arr.length;
        for(int i=0;i<)


    }*/
    //Using temp Array because of O(N*D) complexity -time limit exceeded when rotating one by one

    public void rotateByUsingTempArray(int[] arr,int k){
        int n=arr.length;
        while (k > n) {
            k= k - n;
        }
        int[] tempArray=new int[n-k];
        for(int i=0;i<n-k;i++){
            tempArray[i]=arr[i];
        }

        for(int i=n-k;i<n;i++){
            arr[i-n+k]=arr[i];
        }
        
        for(int i=0;i<n-k;i++){
            arr[i+k]=tempArray[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private void roatateByOne(int[] nums,int n){
        int i;
        int last=nums[n-1];
        for(i=n-1;i>0;i--){
                nums[i]=nums[i-1];
        }
        nums[i]=last;
    }
    private void rotate(int[] nums, int k){
        int n=nums.length;
        for(int i=0;i<k;i++){
            roatateByOne(nums, n);
        }

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args){
        RightRotaionArrayByK r=new RightRotaionArrayByK();
       // r.rotate(new int[]{1,2,3,4,5,6,7}, 3);
        r.rotateByUsingTempArray(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
