package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // for(int i =0; i< nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return null;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], i); //key value pair.
        }

        for(int i =0 ; i<nums.length; i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[] {i, map.get(target - nums[i])};
            }
        }

        return null;
    }   
}