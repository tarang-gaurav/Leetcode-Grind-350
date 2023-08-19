public class SortColors {

    
    ///Dutch National Flag Algorithm
    public void sortColors2(int[] nums) {
        int n=nums.length;
        int low=0, mid=0, high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
   }


    public void sortColors1(int[] nums) {
        int n=nums.length;
        int count0=0,count1=0,count2=0;
        System.out.println("hi");
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
             else if(nums[i]==2){
                count2++;
            }
        }
        int i=0;
        while(count0>0){
            nums[i]=0;
            i++;
            count0--;
        }
        while(count1>0){
            nums[i]=1;
            i++;
            count1--;
        }
        while(count2>0){
            nums[i]=2;
            i++;
            count2--;
        }
        

    }

    public static void main(String[] args) {
        SortColors s=new SortColors();
        int[] a=new int[]{2,0,2,1,1,0};
        s.sortColors1(a);
        for(int i:a)
            System.out.println(i);
    }
}
