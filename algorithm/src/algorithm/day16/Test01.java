package algorithm.day16;

/**
 * @author wuyj
 * @date 2022/1/1 10:47 下午
 *
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 */
public class Test01 {

    public boolean isValidBST(TreeNode root) {
       return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    public boolean isValidBST(TreeNode root,long lower ,long upper) {
        if (root == null){
            return true;
        }
        if (root.val <= lower || root.val >= upper){
            return false;
        }
        return isValidBST(root.left,lower, root.val) && isValidBST(root.right,root.val, upper);
    }
}
