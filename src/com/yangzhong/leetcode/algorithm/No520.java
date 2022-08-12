package com.yangzhong.leetcode.algorithm;

/**
 * @Author yangzhong
 * @Date 2022-08-11 20:54
 * @Description 描述
 */
public class No520 {

    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
}
