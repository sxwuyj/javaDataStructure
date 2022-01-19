package algorithm.day14;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wuyj
 * @date 2021/12/30 10:04 下午
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 *
 */
public class Test02 {

    /**
     * 广度优先
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        Queue<TreeNode> queue_node = new LinkedList<>();
        Queue<Integer> queue_val = new LinkedList<>();
        queue_node.offer(root);
        queue_val.offer(root.val);
        while (!queue_node.isEmpty()){
            TreeNode cur = queue_node.poll();
            Integer val = queue_val.poll();
            if (cur.right ==null && cur.left == null){
                if (val == targetSum){
                    return true;
                }
            }
            if (cur.left != null){
                queue_node.offer(cur.left);
                queue_val.offer(val + cur.left.val);
            }
            if (cur.right != null){
                queue_node.offer(cur.right);
                queue_val.offer(val + cur.right.val);
            }
        }
        return false;
    }


    /**
     * 递归
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return root.val == targetSum;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
