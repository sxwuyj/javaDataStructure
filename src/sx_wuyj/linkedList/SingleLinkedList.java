package sx_wuyj.linkedList;

/**
 * @author sx_wuyj
 * @version 1.0.0
 * @ClassName SingleLinkedList.java
 * @Description 定义链表
 * @createTime 2019年06月25日 20:34:00
 */
public class SingleLinkedList {
    //初始化头结点，不存储信息数据。
    private Node head = new Node(0,"");

    /**
     * 添加到链表末尾
     */
    public void add(Node node){
        //因为头结点不能动，定义一个temp变量（指针）
        Node temp = head;

        while (true){
            if (temp.next == null){
                break;
            }
            //如果没有找到最后一个节点，就讲temp后移
            temp = temp.next;
        }
        temp.next=node;
    }


    /**
     * 按照ID插入链表
     */
    public void addOrderBy(Node node){
        //判断链表是否为空
        Node temp = head;
        boolean flag = false;
        while (true){
            //说明已经指向了最后一个节点
            if (temp.next ==null){
                break;
            }
            //找到了插入位置
            if (temp.next.getId() > node.getId()){
                break;
            }else if (temp.next.getId() == node.getId()){
                flag = true;
                break;
            }
            //将指针后移，指向下一个
            temp = temp.next;
        }
        //判断flag，确认ID是否重复
        if (flag){
            throw new RuntimeException("ID已经重复"+ node.getId());
        }else {
            //插入数据
            node.next = temp.next;
            temp.next = node;
        }

    }
    /**
     * 查看链表
     */

    public void list(){
        //判断链表是否为空
        if (head.next == null){
            throw new RuntimeException("链表为空");
        }

        Node temp = head;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }

    }
}
