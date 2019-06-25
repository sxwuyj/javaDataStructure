package sx_wuyj.linkedList;

/**
 * @author sx_wuyj
 * @version 1.0.0
 * @ClassName Node.java
 * @Description 定义节点
 * @createTime 2019年06月25日 20:29:00
 */
public class Node {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 姓名（链表数据）
     */
    private String name;
    /**
     * 指向下一个节点
     */
    public Node next;


    public Node(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
