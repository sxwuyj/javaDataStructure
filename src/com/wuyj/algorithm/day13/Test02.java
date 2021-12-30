package com.wuyj.algorithm.day13;

/**
 * @author wuyj
 * @date 2021/12/29 10:26 下午
 */
public class Test02 {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else{
            int i = maxDepth(root.left);
            int z = maxDepth(root.right);
            return Math.max(i,z)+1;
        }
    }


}
