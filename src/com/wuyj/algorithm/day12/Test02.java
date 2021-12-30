package com.wuyj.algorithm.day12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyj
 * @date 2021/12/28 10:56 下午
 *
 * 中序遍历
 */
public class Test02 {

    /**
     * 非递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        while (root !=null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode cur = stack.pop();
            res.add(cur.val);
            root = cur.right;
        }
        return res;
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
        recursive(root.left,res);
        res.add(root.val);
        recursive(root.right,res);
    }
}
