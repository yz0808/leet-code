package com.yangzhong.leetcode.studyplan;

/**
 * @Author yangzhong
 * @Date 2022-01-09 20:32
 * @Description 977.有序数组的平方
 * @Tips 双指针
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class No977 {

    /**
     * 给你一个按非递减顺序排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * <p>
     * 输入：nums = [-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 解释：平方后，数组变为 [16,1,0,9,100]
     * 排序后，数组变为 [0,1,9,16,100]
     * <p>
     * 输入：nums = [-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int[] newInt = new int[nums.length];

        for (int i = 0, j = nums.length - 1, pos = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                newInt[pos] = nums[i] * nums[i];
                i++;
            } else {
                newInt[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return newInt;
    }
}
