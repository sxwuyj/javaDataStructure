package algorithm.day09;

/**
 * @author wuyj
 * @date 2021/12/25 10:31 下午
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Test02 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode listNode = mergeTwoLists1(list1, list2);
    }

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if (list1 == null ){
           return list2;
       }else if (list2 == null){
           return list1;
       }else if (list1.val < list2.val){
           list1.next =  mergeTwoLists(list1.next,list2);
           return list1;
       }else {
           list2.next =  mergeTwoLists(list1,list2.next);
           return list2;
       }
    }


    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;

    }


}
