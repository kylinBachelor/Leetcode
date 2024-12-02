package main.java.leetcode.leetcode1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class Question {

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] result = twoSum2(arr, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    /**
     * 暴力循环求解
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) != i) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            }
        }
        return result;
    }
    
}
