package algorithm.day09;

/**
 * @author wuyj
 * @date 2021/12/25 11:10 下午
 *
 * 给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class Test03 {

    public ListNode removeElements(ListNode head, int val) {
        if (head ==null ){
            return head;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;

    }

}
