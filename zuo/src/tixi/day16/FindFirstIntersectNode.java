package tixi.day16;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/27 23:37
 */
public class FindFirstIntersectNode {

    public static Node getIntersectNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        //确认两个链表是否有环
        Node loop1 = getLoopNode(head1);
        Node loop2 = getLoopNode(head2);

        //两个链表都不存在环
        if (loop1 == null && loop2 == null) {
            return noLoop(head1, head2);
        }
        //两个链表一个有环一个无环,肯定不会相交
        if (loop1 != null && loop2 != null) {
            return bothLoop(head1, loop1, head2, loop2);
        }
        return null;
    }

    /**
     * 其中一个有环的情况
     * @param head1
     * @param loop1
     * @param head2
     * @param loop2
     * @return
     */
    private static Node bothLoop(Node head1, Node loop1, Node head2, Node loop2) {
        Node cur1 = null;
        Node cur2 = null;
        //入环节点相等,说明相交的节点在入环点之前
        if (loop1 == loop2){
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while (cur1.next != loop1){
                n ++;
                cur1 = cur1.next;
            }
            while (cur2.next != loop1){
                n--;
                cur2 = cur2.next;
            }

            cur1 = n >0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            Math.abs(n);
            while (n != 0){
                n--;
                cur1= cur1.next;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;

        }else {
            cur1 = loop1.next;
            while (cur1 != loop1){
                if (cur1 == loop2){
                    return cur1;
                }
                cur1 = cur1.next;
            }
            return null;
        }

    }

    /**
     * 不存在环寻找第一个相交的节点
     * @return
     */
    private static Node noLoop(Node head1, Node head2) {
        if (head1 == null || head2 == null){
            return null;
        }
        int res = 0;
        Node cur1 = head1;
        Node cur2 = head2;

        while (cur1.next != null){
            res ++;
            cur1 = cur1.next;
        }
        while (cur2.next != null){
            res --;
            cur2 = cur2.next;
        }

        //如果两个无环链表,最后一个节点内存地址不等,一定没相交
        if (cur1 != cur2){
            return null;
        }
        //链表长的为cur1
        cur1 = res >0 ? head1 : head2;
        //链表长的为cur2
        cur2 = cur1 == head1 ? head2 : head1;

        Math.abs(res);

        while (res > 0){
            res--;
            cur1 = cur1.next;
        }

        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    /**
     * 找到入环的第一个节点
     * @param head
     * @return
     */
    private static Node getLoopNode(Node head) {
        if (head == null || head.next ==null || head.next.next == null){
            return null;
        }

        Node n1 = head.next;
        Node n2 = head.next.next;
        while (n1 != n2){
            if (n1.next == null || n2.next == null){
                return null;
            }
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = head;
        while (n1 != n2){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;

    }

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6

        System.out.println(getIntersectNode(head1, head2).value);
// 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(getIntersectNode(head1, head2).value);

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);
    }
}
