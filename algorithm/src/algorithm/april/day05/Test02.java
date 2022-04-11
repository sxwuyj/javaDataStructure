package algorithm.april.day05;

/**
 * @author wuyj
 * @date 2022/4/11 10:46 下午
 */
public class Test02 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        ListNode right = head;
        ListNode left = temp;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return temp.next;
    }
}
