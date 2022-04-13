package algorithm.april.day07;

import algorithm.entity.ListNode;

/**
 * @author wuyj
 * @date 2022/4/13 10:26 下午
 *
 * 反转单链表
 */
public class Test01 {

    public ListNode reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
