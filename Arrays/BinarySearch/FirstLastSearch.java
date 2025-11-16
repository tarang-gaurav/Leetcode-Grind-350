
public class FirstLastSearch {

public int searchLast(int[] arr , int x){
int n = arr.length;
    int low =0,high = n-1;
    int ans =-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]==x){
            ans = mid;
            low = mid+1;
        }
        else if (arr[mid]>x){
            high = mid -1;
        }
        else {
            low = mid+1;
        }
    }
    return ans;
 }   
 



 public int searchFirst(int[] arr , int x){
    int n = arr.length;
    int low =0,high = n-1;
    int ans =-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]==x){
            ans = mid;
            high = mid-1;
        }
        else if (arr[mid]>x){
            high = mid -1;
        }
        else {
            low = mid+1;
        }
    }
    return ans;
 }   
 


 public static void main(String[] args) {


        System.out.println("hi binary!!!");
        FirstLastSearch s =  new FirstLastSearch();
        int res1 = s.searchFirst(new int[]{5,7,7,7,8,8,10}, 7);
        int res2 = s.searchLast(new int[]{5,7,7,7,8,8,10}, 7);

        System.out.println(res1 + " ," +res2 );
    
    
    
    }

}
