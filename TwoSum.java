//  https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public final class TwoSum {

    public int[] bruteTwoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(target-num)) {
                res[0] = map.get(target-num);
                res[1] = i;
                return res;
            }
            map.put(num, i);
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
