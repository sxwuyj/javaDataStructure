package tixi.day18;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树先序序列化和反序列化
 * @author wuyj
 * @date 2023/3/20 22:35
 */
public class Test02 {

    public static class Node1{
        public int value;
        public Node1 left;
        public Node1 right;
    }

    public Queue<String> preSerial(Node1 head){
        Queue<String> ans = new LinkedList<>();
        pres(head,ans);
        return ans;
    }

    private void pres(Node1 head, Queue<String> ans) {
        if (head == null){
            ans.add(null);
        }else {
            ans.add(String.valueOf(head.value));
            pres(head.left,ans);
            pres(head.right,ans);
        }
    }
}
