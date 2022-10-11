package com.yangzhong.leetcode.algorithm;

/**
 * @Author yangzhong
 * @Date 2022-08-11 21:07
 * @Description 反转链表
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class No206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
