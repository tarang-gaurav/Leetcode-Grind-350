package BinarySearch;

public class SearchInsert {

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
        return low;

    }

    public static void main(String[] args) {
        System.out.println("hi binary!!!");
        System.out.println("Index at : "+binarySearch
        (new int[]{1,3,5,6}, 4));
    }
}
