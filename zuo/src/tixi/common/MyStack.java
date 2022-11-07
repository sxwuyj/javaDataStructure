package tixi.common;

import java.util.Stack;

/**
 * @author wuyj
 * @date 2022/11/7 22:42
 */
public class MyStack {

    Stack<Integer> stackData;
    Stack<Integer> stackMin;

    public MyStack() {
        Stack<Integer> stackData = new Stack<>();
        Stack<Integer> stackMin = new Stack<>();
    }

    public void push(Integer num) {
        stackData.push(num);
        if (stackMin.isEmpty()) {
            stackMin.push(num);
        } else if (this.getMin() >= num) {
            stackMin.push(num);
        }
    }

    public Integer pop(){
        if (stackData.isEmpty()) {
            throw new RuntimeException("没数了");
        }
        stackMin.pop();
        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("没数了");
        }
        return stackMin.peek();
    }


}
