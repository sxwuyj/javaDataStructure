package algorithm.day16;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author wuyj
 * @date 2022/1/1 11:15 下午
 *
 * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 */
public class Test02 {

    /**
     * 递归
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> integers = new HashSet<>();
        return find(root,k,integers);
    }

    public boolean find(TreeNode root, int k, Set < Integer > set) {
        if (root == null){
            return false;
        }
        if (set.contains(k- root.val)){
            return true;
        }
        set.add(root.val);
        return find(root.left,k,set) || find(root.right,k,set);
    }


    /**
     * 广度优先
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget1(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue< TreeNode > queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            if (queue.peek() != null){
                if (set.contains(k - root.val)){
                    return true;
                }
                set.add(root.val);
                queue.add(root.left);
                queue.add(root.right);
            }else {
                queue.remove();
            }
        }
        return false;
    }
}
