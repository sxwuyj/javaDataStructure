package tixi.day14;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/24 21:46
 */
public class IsPalindromeList2 {

    public static boolean isPalindromeList(Node head){
        if (head == null || head.next == null){
            return false;
        }

        Node n1 = head;
        Node n2 = head;

        while (n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }

        Node n3 = null;
        n2 = n1.next;
        n1.next = null;
        while (n2 != null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }

        boolean res = true;
        n3 = n1;
        n2 = head;
        while (n2.next != null || n1.next != null){
            if (n2.value != n1.value){
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        n2 = n3.next;
        n3.next = null;
        while (n2 != null){
            n1 = n2.next;
            n2.next = n3;
            n3 = n2;
            n2 = n1;
        }
        return res;
    }

    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println(isPalindromeList(head));
    }
}
