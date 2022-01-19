package algorithm.day09;

import java.util.HashSet;

/**
 * @author wuyj
 * @date 2021/12/25 9:59 下午
 *
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *

 */
public class Test01 {
    public static void main(String[] args) {

    }

    /**
     * hash 表
     *
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode01 head) {
        HashSet<ListNode01> set = new HashSet<>();
        while (head != null){
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode01 head) {
        if (head ==null || head.next ==null){
            return false;
        }
        ListNode01 slow = head;
        ListNode01 quick = head.next;
        while (slow != quick){
            if (quick == null || quick.next == null){
                return false;
            }
            quick = quick.next.next;
            slow = slow.next;
        }
        return true;
    }
}
