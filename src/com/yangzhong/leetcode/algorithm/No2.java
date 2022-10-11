package com.yangzhong.leetcode.algorithm;

/**
 * @Author yangzhong
 * @Date 2022-08-14 19:07
 * @Description 描述
 */
public class No2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = 0;
            if (l1 != null) {
                a = l1.val;
            }
            int b = 0;
            if (l2 != null) {
                b = l2.val;
            }
            if (newNode == null) {
                newNode = new ListNode();
                if ((a + b + carry) < 10) {
                    newNode.val = (a + b + carry);
                    carry = 0;
                } else {
                    newNode.val = (a + b + carry) - 10;
                    carry = 1;
                }
            } else {
                ListNode nextNode = new ListNode();

            }

            if (l1.next == null && l2.next == null) {
                return newNode;
            }
        }
        return newNode;
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