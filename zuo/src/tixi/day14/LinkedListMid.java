package tixi.day14;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/23 21:24
 */
public class LinkedListMid {


    /**
     * 找到链表的中点 偶数节点
     * @param head
     * @return
     */
    public static Node midOrDownMidNode(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node quick = head.next;
        Node solw = head.next;
        while (quick.next != null && quick.next.next != null){
            quick = quick.next.next;
            solw = solw.next;
        }
        return solw;
    }

    public static Node midOrUpMidNode(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node quick = head.next;
        Node solw = head.next.next;
        while (quick.next != null && quick.next.next != null){
            quick = quick.next.next;
            solw = solw.next;
        }
        return solw;
    }

    public static Node midOrDownMidNode1(Node head) {
        if (head == null || head.next ==null){
            return null;
        }
        Node solw = head.next;
        Node quick = head.next;
        while (quick.next != null && quick.next.next != null){
            quick = quick.next.next;
            solw = solw.next;
        }
        return solw;
    }

        public static void main(String[] args) {
        Node test = null;
        test = new Node(0);
        test.next = new Node(1);
        test.next.next = new Node(2);
        test.next.next.next = new Node(3);
        test.next.next.next.next = new Node(4);
        test.next.next.next.next.next = new Node(5);
        test.next.next.next.next.next.next = new Node(6);
        test.next.next.next.next.next.next.next = new Node(7);
        test.next.next.next.next.next.next.next.next = new Node(8);

        Node ans1 = null;
        Node ans2 = null;

        ans1 = midOrDownMidNode1(test);
        System.out.println(ans1 != null ? ans1.value : "无");
        System.out.println(ans2 != null ? ans2.value : "无");

    }
}
