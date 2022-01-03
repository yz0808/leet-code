package com.yangzhong.leetcode.studyplan;

/**
 * @Author yangzhong
 * @Date 2022-01-03 15:45
 * @Description 704.二分查找
 * https://leetcode-cn.com/problems/binary-search/
 */
public class No704 {
    /**
     * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
     * <p>
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * <p>
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     * <p>
     * 你可以假设 nums 中的所有元素是不重复的。
     * n 将在 [1, 10000]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1 / 2);
    }

    /**
     * while循环
     *
     * @param nums
     * @param target
     * @return
     */
    public int bestCompute(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // 求中位数
            int middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 递归
     *
     * @param nums
     * @param target
     * @return
     */
    public static int compute2(int[] nums, int target) {
        return doCompute(0, nums.length - 1, nums, target);
    }

    private static int doCompute(int start, int end, int[] nums, int target) {
        if (start < 0) {
            return -1;
        }
        if (end >= nums.length) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        int length = end - start + 1;
        int middle = length / 2 + start;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] < target) {
            return doCompute(middle + 1, end, nums, target);
        } else {
            return doCompute(0, middle - 1, nums, target);
        }
    }

    public static int compute1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
