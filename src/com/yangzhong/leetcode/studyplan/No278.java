package com.yangzhong.leetcode.studyplan;

/**
 * @Author yangzhong
 * @Date 2022-01-03 16:50
 * @Description 278.第一个错误的版本
 * https://leetcode-cn.com/problems/first-bad-version/
 */
public class No278 {

    /**
     * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
     * <p>
     * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
     * <p>
     * 你可以通过调用bool isBadVersion(version)接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
     * <p>
     * 输入：n = 5, bad = 4
     * 输出：4
     * 解释：
     * 调用 isBadVersion(3) -> false
     * 调用 isBadVersion(5)-> true
     * 调用 isBadVersion(4)-> true
     * 所以，4 是第一个错误的版本。
     * <p>
     * 输入：n = 1, bad = 1
     * 输出：1
     * <p>
     * 1 <= bad <= n <= 231 - 1
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
            return 1;
        }
        int left = 1;
        int right = n;
        int first = 1;
        while (left <= right) {
            if (!isBadVersion(right)) {
                return first;
            }
            if (isBadVersion(left)) {
                return left;
            }
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                first = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return first;
    }

    private boolean isBadVersion(int x) {
        return x == 0;
    }
}
