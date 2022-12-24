package tixi.day15;

import tixi.common.Node;

/**
 * @author wuyj
 * @date 2022/12/24 23:24
 */public class SmallerEqualBigger1 {

    public static Node listPartition(Node head, int target){
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
        //用来记录当前节点指向的位置
        Node next = null;

        while (head != null){
            //先拿到当前节点的下一个位置
            next = head.next;
            //将当前节点的下一个位置改为null,因为链表需要重新连接
            head.next = null;
            //判断小于目标值的情况
            if (head.value < target){
                //判断小头或者小尾是否有值,没有值初始化小头小尾为当前节点
                if (minEnd == null){
                    minHead = head;
                    minEnd = head;
                }else {
                    //有值在小尾后面追加,可以保证稳定性
                    minEnd.next = head;
                    //小尾指针来到新的小尾位置
                    minEnd = head;
                }
            }else if (head.value == target){
                //判断等头或者等尾是否有值,没有值初始化等头等尾为当前节点
                if (equalsEnd == null){
                    equalsHead = head;
                    equalsEnd = head;
                }else {
                    //有值在等尾后面追加,可以保证稳定性
                    equalsEnd.next = head;
                    //等尾指针来到新的等尾位置
                    equalsEnd = head;
                }
            }else {
                //判断大头或者大尾是否有值,没有值初始化大头大尾为当前节点
                if (maxEnd == null){
                    maxHead = head;
                    maxEnd = head;
                }else {
                    //有值在大尾后面追加,可以保证稳定性
                    maxEnd.next = head;
                    //大尾指针来到新的等尾位置
                    maxEnd = head;
                }
            }
            //移动到下一个节点
            head = next;
        }
        //进行小尾链接等头,等尾链接大头,需要考虑不存在的情况

        //小尾有值的情况
        if (minEnd != null){
            //先不考虑等头是否有值,小尾连等头
            minEnd.next = equalsHead;
            //如果等尾有值,那么接下来用等尾链接大头,如果没有值,用小尾链接大头
            equalsEnd = equalsEnd == null ? minEnd : equalsEnd;
        }

        //等尾已经尽量保证有值,但是也有可能小和等都不存在
        if (equalsEnd != null){
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
