package algorithm.day12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wuyj
 * @date 2021/12/28 11:07 下午
 *
 * 后续遍历
 *
 *
 */
public class Test03 {

    /**
     * 非递归
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                res.add(root.val);
                stack.push(root);
                root = root.right;
            }
            TreeNode cur = stack.pop();
            root = cur.left;
        }
        Collections.reverse(res);
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
        recursive(root.right,res);
        res.add(root.val);
    }
}
