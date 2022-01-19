package algorithm.day13;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wuyj
 * @date 2021/12/29 10:39 下午
 */
public class Test03 {

    /**
     * 递归算法
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode root1,TreeNode roo2){
        if (root1 == null && roo2 ==null){
            return true;
        }
        if (root1 == null || roo2 ==null){
            return false;
        }
        return root1.val == roo2.val
                && check(root1.left,roo2.right)
                && check(root1.right,roo2.left);
    }


    /**
     * 迭代
     * @param root
     * @return
     */
    public boolean isSymmetric1(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()){
            TreeNode node1 = treeNodes.poll();
            TreeNode node2 = treeNodes.poll();
            if (node1 == null && node2 ==null){
                continue;
            }
            if (node1 == null || node2 == null){
                return false;
            }
            if (node1.val != node2.val){
                return false;
            }


            treeNodes.offer(node1.left);
            treeNodes.offer(node2.right);
            treeNodes.offer(node1.right);
            treeNodes.offer(node2.left);
        }
        return true;
    }
}
