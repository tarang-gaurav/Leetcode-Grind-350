package BinarySearch;

public class BinarySearch{

    private static int binarySearch(int[] arr , int x){

        int low = 0;
        int high = arr.length -1 ;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<x)
                low = mid+1;
            else if(arr[mid]>x)
                high = mid-1;
            else
                return mid;
        }
        return -1;
    

    }

    public static void main(String[] args) {
        System.out.println("hi binary!!!");
        System.out.println("Index at : "+binarySearch
        (new int[]{1,2,5,67,78,89,90,2234,35345,5464464}, 93240));
    }
}
