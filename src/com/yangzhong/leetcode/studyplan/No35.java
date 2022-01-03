package com.yangzhong.leetcode.studyplan;

/**
 * @Author yangzhong
 * @Date 2022-01-03 17:26
 * @Description 35.搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class No35 {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 请必须使用时间复杂度为 O(log n) 的算法。
     * <p>
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     * <p>
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     * <p>
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     * <p>
     * 输入: nums = [1,3,5,6], target = 0
     * 输出: 0
     * <p>
     * 输入: nums = [1], target = 0
     * 输出: 0
     * <p>
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums 为无重复元素的升序排列数组
     * -104 <= target <= 104
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            // 中位值小于target 在右边
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
            last = middle;
        }
        if (nums[last] < target) {
            return last + 1;
        }
        return last;
    }
}
