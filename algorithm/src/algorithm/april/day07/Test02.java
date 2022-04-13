package algorithm.april.day07;

import algorithm.entity.ListNode;

/**
 * @author wuyj
 * @date 2022/4/13 10:38 下午
 * <p>
 * 删除链表中指定的值
 */
public class Test02 {

    public ListNode deleteNum(ListNode head, int num) {
        //找到第一个不需要删除
        while (head != null){
            if (head.val != num){
                break;
            }
            head = head.next;
        }
        
        ListNode pre = head;
        ListNode cur = head;
        while (cur != null){
            if (cur.val == num){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = head.next;
        }
        return pre;
    }
}
