package algorithm.entity;

/**
 * @author wuyj
 * @date 2022/4/11 10:41 下午
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        String url = "http://futuresopenapi.wuyj.top";
        if( (!url.startsWith("http") || !url.startsWith("https"))){
            url = "http://" + url;
        }
    }
}
