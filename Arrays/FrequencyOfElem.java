
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElem {
    

    private Map<Integer,Integer> countElem(int[] arr){
        //int count=0;
        Map<Integer,Integer> countMap=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i], countMap.get(arr[i])+1);
            }
            else{
                countMap.put(arr[i], 1);
            }
        }

        return countMap;
    }

    public static void main(String[] args){
        FrequencyOfElem s=new FrequencyOfElem();
        int[] arr={0,1,1,2,2,2,2,3};
        System.out.println(s.countElem(arr));
    }


}
