package tixi.day04;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/11/3 22:24
 *
 * 删除链表中给定的值
 */
public class RemoveNode {

    public static Node removeNode(Node head ,int target){
        //找到第一个不是目标值的节点
        while (head.next != null){
            if (head.value == target){
                break;
            }
            head = head.next;
        }

        Node pre = head;
        Node cur = head;
        while (head.next != null){
            if (pre.value == target){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
