package tixi.day04;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/11/3 22:04
 */
public class ReverseNode {

    public Node reverseNode(Node head){
        Node pre = null;
        Node next = null;
        while (head.next != null){
           next =  head.next ;
           head.next = pre;
           pre = head;
           head = next;
        }
        return pre;
    }
}


