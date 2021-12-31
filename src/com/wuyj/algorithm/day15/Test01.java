package com.wuyj.algorithm.day15;

/**
 * @author wuyj
 * @date 2021/12/31 9:13 下午
 *
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */
public class Test01 {

    public TreeNode searchBST(TreeNode root, int val) {
       if (root == null){
           return null;
       }
      while (root != null){
          if (val == root.val){
              return root;
          }
          root = val < root.val ? root.left : root.right;
      }
      return null;
    }
}
