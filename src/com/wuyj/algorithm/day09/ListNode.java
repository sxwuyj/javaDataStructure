package com.wuyj.algorithm.day09;

/**
 * @author wuyj
 * @date 2021/12/25 10:30 下午
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
