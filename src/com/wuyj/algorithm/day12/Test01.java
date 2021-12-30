package com.wuyj.algorithm.day12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyj
 * @date 2021/12/28 10:29 下午
 *
 *
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class Test01 {


    /**
     * 非递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> statck = new ArrayDeque<>();
        while (root != null || !statck.isEmpty()){
            while (root != null){
                statck.push(root);
                root = root.left;
            }
            res.add(root.val);
            TreeNode cur = statck.pop();
            root = cur.right;
        }
        return  res;
    }


    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        recursive(root,res);
        return res;
    }

    public void recursive(TreeNode root,ArrayList<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        recursive(root.left,res);
        recursive(root.right,res);
    }
}
