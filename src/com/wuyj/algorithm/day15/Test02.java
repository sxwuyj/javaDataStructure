package com.wuyj.algorithm.day15;

/**
 * @author wuyj
 * @date 2021/12/31 9:23 下午
 *
 *
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
 *
 */
public class Test02 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            return new TreeNode(val);
        }
        TreeNode cur = root;
        while (cur != null){
            if (val < cur.val){
                if (cur.left == null){
                    cur.left = new TreeNode(val);
                    break;
                }else{
                    cur = cur.left;
                }
            }else {
                if (cur.right == null){
                    cur.right = new TreeNode(val);
                    break;
                }else {
                    cur = cur.right;
                }
            }
        }
       return null;
    }
}
