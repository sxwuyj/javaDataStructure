package algorithm.april.day05;

/**
 * @author wuyj
 * @date 2022/4/11 10:40 下午
 */
public class Test01 {

    public ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while (right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        return left;
    }
}
