package sx_wuyj.linkedList;

/**
 * @author sx_wuyj
 * @version 1.0.0
 * @ClassName test.java
 * @Description 测试链表
 * @createTime 2019年06月25日 20:51:00
 */
public class test {

    public static void main(String[] args) {
        Node node1 = new Node(1, "张三");
        Node node2 = new Node(2, "李四");
        Node node3 = new Node(3, "王五");
        Node node4 = new Node(1, "zhao");

        SingleLinkedList single = new SingleLinkedList();
        /*single.add(node1);
        single.add(node2);
        single.add(node3);*/

        single.addOrderBy(node1);
        single.addOrderBy(node3);
        single.addOrderBy(node2);
        single.update(node4);
        single.del(1);
        single.list();
    }
}
