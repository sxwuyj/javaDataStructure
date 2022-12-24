package tixi.common;

/**
 * @author wuyj
 * @date 2022/11/3 22:05
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }

}
