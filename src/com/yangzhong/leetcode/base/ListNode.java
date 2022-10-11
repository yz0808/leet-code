package com.yangzhong.leetcode.base;

/**
 * @Author yangzhong
 * @Date 2022-09-23 15:31
 * @Description 链表
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
