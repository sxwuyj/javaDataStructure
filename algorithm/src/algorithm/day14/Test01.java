package algorithm.day14;

/**
 * @author wuyj
 * @date 2021/12/30 9:53 下午
 *
 * 翻转一棵二叉树。
 */
public class Test01 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


}
