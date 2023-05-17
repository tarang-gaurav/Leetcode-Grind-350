public class SecondLargest {
    
    int print2largest(int arr[], int n) {
        // code here     
        int max=arr[0];
        int secondMax=-1;
        
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
            //finding the middle elem between secondMax and Max from arr[i]
            else if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
    
        return secondMax;
    }

    
}
