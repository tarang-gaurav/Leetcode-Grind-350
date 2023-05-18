import java.util.Stack;

public class CheckArraySortedAfterRotaion {
    

    private boolean isArraySorted(int[] arr,int n){
         // we can use use Stack to know whether array is sorted or not      
         //if(stack.isEmpty() && nums[i]<stack.peek())

         //using recursion
         /*if (arr[n - 1] < arr[n - 2])
            return 0;
         Last pair was sorted
         Keep on checking
          return arraySortedOrNot(arr, n - 1);*/

         //For now we are comparing next elem 


        if(n==1)
            return true;
        if(n==2){
            if(arr[0]<=arr[1])
                return true;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    private void leftRotateByOne(int[] arr,int n){
        int i;
        int first=arr[0];
        for(i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=first;

    }
    private void leftRotation(int[] nums,int n){
        for(int i=0;i<n;i++){
            leftRotateByOne(nums,n);
        }
    }
    private boolean checkSortedPossibleAfterRotaion(int[] nums){
        int n=nums.length;

        if(isArraySorted(nums, n)){
            return true;
        }
        else{
            ///Acc to Question we are going to rotate elem in left direction
            //3 4 5 1 2 -----> 4 5 1 2 3----> 1 2 3 4 5
           
             
             for(int i=0;i<n;i++){
                if(isArraySorted(nums, n))
                    return true;
                else 
                    leftRotateByOne(nums,n);
            
            }
            return false;
            

        }
  

    }

    public static void main(String args[]){
        CheckArraySortedAfterRotaion p=new CheckArraySortedAfterRotaion();
        int[] arr=new int[]{2,1,3,4};
        System.out.println(p.isArraySorted(arr, 4));
       System.out.println(p.checkSortedPossibleAfterRotaion(arr));
    }
}
