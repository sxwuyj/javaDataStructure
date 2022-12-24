package tixi.day14;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/24 21:31
 */
public class IsPalindromeList1 {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null){
            return false;
        }
        //找到链表的中点
        Node n1 = head;
        Node n2 = head;
        while (n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }


        Node n3 = null;
        n2 = n1.next;
        n1 = null;
        while (n2 != null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }

        boolean res = true;
        n3 = n1;
        n2 = head;
        while (n1.next != null || n2.next != null ){
            if (n1.value != n2.value){
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        n1 = n3.next;
        n3.next = null;
        while (n1 != null){
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return res;
    }
}
