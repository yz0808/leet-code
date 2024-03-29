package com.yangzhong.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yangzhong
 * @Date 2022-01-03 20:14
 * @Description 1.两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class No1 {
    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * <p>
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                int[] ints = new int[2];
                ints[0] = map.get(target - nums[i]);
                ints[1] = i;
                return ints;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
