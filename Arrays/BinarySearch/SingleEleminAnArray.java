package BinarySearch;

public class SingleEleminAnArray {



    private int getSingleElement(int[] arr){

        if(arr.length==1){
            return arr[0];
        }

        if(arr[0] != arr[1]){
            return arr[0];
        }
        int len = arr.length;

        if(arr[len-1] !=arr[len-2]){
            return arr[len-1];
        }

        int low = 0,high=len-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            //Check mid elem
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            // Check the index is even
            if(mid%2==0){
                if(arr[mid] == arr[mid+1]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
            if(mid%2!=0){
                 if(arr[mid-1] == arr[mid]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println("hi binary!!!");
        SingleEleminAnArray s =  new SingleEleminAnArray();
        System.out.println(s.getSingleElement(new int[]{3,3,7,7,10,11,11}));
    }
}
