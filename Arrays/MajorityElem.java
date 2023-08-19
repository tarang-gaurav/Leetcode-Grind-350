import java.util.*;

public class MajorityElem {
    ////Find the Majority Element that occurs more than N/2 times where N=Size of array
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0,elem=0;
        for(int i=0;i<n;i++){
          if(count==0){
              elem=nums[i];
              count=1;
          }
          else if(elem==nums[i]){
              count++;
          }
          else{
              count--;
          }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elem){
                count1++;
            }
            
        }
         if(count1>(n/2))
             return elem;
     return -1;
     }

    int majorityElem(int[] arr){
        int N=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>(N/2))
                    return entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        MajorityElem m=new MajorityElem();
        System.out.println(m.majorityElem(new int[]{2,2,1,1,1,2,2}));
    }
}
