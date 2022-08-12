package com.yangzhong.leetcode.algorithm;

/**
 * @Author yangzhong
 * @Date 2022-08-11 21:38
 * @Description 描述
 */
public class No26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        int fast = 1;
        int slow = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
