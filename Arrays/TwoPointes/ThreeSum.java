package TwoPointes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            
            Set<Integer> set = new HashSet<>();

            for(int j=i+1;j<nums.length;j++){

            int requiredNum = -(nums[i]+nums[j]);
            if(set.contains(requiredNum)){
                List<Integer> temp = Arrays.asList(nums[i],nums[j],requiredNum);
                Collections.sort(temp);
                res.add(temp);
            }
            set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);

    }

    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        List<List<Integer>> res = t.threeSum(new int[]{-1,0,1,2,-1,4});

        res.stream().forEach(System.out::println);
    }
}
