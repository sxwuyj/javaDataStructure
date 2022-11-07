package tixi.common;

import java.util.Stack;

/**
 * @author wuyj
 * @date 2022/11/7 23:05
 * 栈实现双端队列
 */
public class MyTwoQueue {

    Stack<Integer> pushStack;
    Stack<Integer> popStack;

    public MyTwoQueue() {
        Stack<Integer> pushStack = new Stack<>();
        Stack<Integer> popStack = new Stack<>();
    }

    /**
     * 到数据
     */
    private void pushToPop() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

    public void push(Integer num) {
        pushStack.push(num);
        pushToPop();
    }

    public Integer poll() {
        pushToPop();
        if (popStack.isEmpty() && pushStack.isEmpty()) {
            throw new RuntimeException("没数了");
        }
        return  popStack.pop();
    }
}
