package tixi.day15;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/24 22:52
 *
 * 给定一个目标值
 *
 * 将整个链表变为小于目标值-->等于目标值--->大于目标值的结构连起来
 */
public class SmallerEqualBigger {

    public static Node listPartition(Node head,int target){

        //小于头指针
        Node minHead = null;
        //小于尾指针
        Node minEnd = null;
        //等于头指针
        Node equalsHead = null;
        //等于尾指针
        Node equalsEnd = null;
        //大于头指针
        Node maxHead = null;
        //大于头尾指针
        Node maxEnd = null;
        Node next = null; // save next node

        while (head != null){
            next = head.next;
            head.next = null;
            if (head.value < target){
                if (minEnd == null){
                    minHead = head;
                    minEnd = head;
                }else {
                    minEnd.next = head;
                    minEnd=head;
                }
            }else if (head.value == target){
                if (equalsEnd == null){
                    equalsHead = head;
                    equalsEnd = head;
                }else {
                    equalsEnd.next = head;
                    equalsEnd = head;

                }
            }else if (head.value > target){
                if (maxEnd == null){
                    maxHead = head;
                    maxEnd = head;
                }else {
                    maxEnd.next = head;
                    maxEnd = head;

                }
            }

            head = next;
        }

        if (minEnd != null){
            minEnd.next = equalsHead;
            equalsHead = equalsEnd == null ? minEnd :equalsHead;
        }

        if (equalsHead != null){
            equalsEnd.next = maxHead;
        }

        return minHead != null ? minHead : equalsHead != null ? equalsHead : maxHead;
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        // head1 = listPartition1(head1, 4);
        head1 = listPartition(head1, 5);
        System.out.println(1);
    }
}
