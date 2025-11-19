public class SearchInRotatedSortedArray {
    
    private int searchInRotatedSortedArray(int[] arr , int k){
        int low =0 ,high = arr.length-1;
        
        while(low<=high){

            int mid = low + (high - low)/2;
            if(arr[mid] == k) return mid;
            //Check if left half is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low]<= k && k<=arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(arr[mid] <= k && k<= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        System.out.println(s.searchInRotatedSortedArray(new int[]{7,8,9,3,5,6}, 5));
    }

}
