package tixi.day17;

import tixi.common.TwoTreeNode;

import java.util.Stack;

/**
 * @author wuyj
 * @date 2022/12/28 22:56
 *
 * 非递归实现二叉树的前中后序遍历
 */
public class Test01 {

    /**
     * 前序
     * @param head
     */
    public static void first(TwoTreeNode head){

        if (head == null){
            return;
        }
        Stack<TwoTreeNode> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()){
            TwoTreeNode pop = stack.pop();
            System.out.println(pop);
            if (pop.right != null){
                stack.push(pop.right);
            }
            if (pop.left != null){
                stack.push(pop.left);
            }
        }
    }

    public static void end(TwoTreeNode head){
        if (head == null){
            return;
        }
        Stack<TwoTreeNode> stack = new Stack<>();
        Stack<TwoTreeNode> stack1 = new Stack<>();

        stack.add(head);
        while (!stack.isEmpty()){
            TwoTreeNode pop = stack.pop();
            stack1.push(pop);
            if (pop.left != null){
                stack.push(pop.left);
            }
            if (pop.right != null){
                stack.push(pop.right);
            }
        }
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
