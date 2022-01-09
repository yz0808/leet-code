package com.yangzhong.leetcode.studyplan;

import java.util.Arrays;

/**
 * @Author yangzhong
 * @Date 2022-01-09 20:57
 * @Description 189.轮转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class No189 {

    /**
     * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
     * <p>
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右轮转 1 步: [7,1,2,3,4,5,6]
     * 向右轮转 2 步: [6,7,1,2,3,4,5]
     * 向右轮转 3 步: [5,6,7,1,2,3,4]
     * <p>
     * 输入：nums = [-1,-100,3,99], k = 2
     * 输出：[3,99,-1,-100]
     * 解释:
     * 向右轮转 1 步: [99,-1,-100,3]
     * 向右轮转 2 步: [3,99,-1,-100]
     *
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {

        }
    }

    public void rotate(int[] nums, int k) {
        int[] newInt = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newInt[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(newInt, 0, nums, 0, newInt.length);
    }
}
