package com.wuyj.algorithm.day10;


/**
 * @author wuyj
 * @date 2021/12/26 10:22 下午
 */
public class Test01 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
