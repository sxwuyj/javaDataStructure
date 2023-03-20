package tixi.day18;

import tixi.common.Node;

import java.util.LinkedList;

/**
 * 二叉树按层遍历
 * @author wuyj
 * @date 2023/3/20 21:39
 */
public class Test01 {
    public static class Node1{
        public int value;
        public Node1 left;
        public Node1 right;
    }

    public void level(Node1 head){
        if (null == head){
         return;
        }
        LinkedList<Node1> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            Node1 cur = queue.poll();
            System.out.println(cur);
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
    }
}
