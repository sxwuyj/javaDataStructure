package tixi.day14;

import tixi.common.Node;

/**
 * 判断一个链表是否为回转结构
 * @author wuyj
 * @date 2022/12/23 22:04
 */
public class IsPalindromeList {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        //慢指针,中点
        Node n1 = head;
        //快指针
        Node n2 = head;
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        //此时n1慢指针找到中点mid
        //进行中点之后的链表反转

        //代表中点的下一个位置
        n2 = n1.next;
        //中点的指针指向null
        n1 = null;
        //定义一个临时变量,交换使用
        Node n3 = null;
        while (n2 != null) {
            //先把原来指向的节点记录下来,不然一会翻转了找不到了
            n3 = n2.next;
            //将下一个节点的指针指向中点,翻转
            n2.next = n1;
            //移动指针到下一个节点
            n1 = n2;
            //移动到原来的指向的节点
            n2 = n3;
        }
        //n1此时已经指向最后一个节点了

        //准备进行判断,n3是最后一个元素
        n3 = n1;
        //n2代表第一个元素
        n2 = head;
        //记录是否为回转结构
        boolean res = true;
        while (n1 != null && n2 != null) {
            if (n1.value != n2.value) {
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        //最后需要将链表复原
        //因为原来中点指向了null,n3之前记录最后一个节点

        //n1变成当前最后一个节点目前指向的节点
        n1 = n3.next;
        //将最后一个节点指向null
        n3.next = null;
        while (n1 != null) {
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
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
        System.out.println(isPalindrome(head));
    }

}
