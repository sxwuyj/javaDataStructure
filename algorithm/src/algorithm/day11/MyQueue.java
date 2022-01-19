package algorithm.day11;

import java.util.LinkedList;

/**
 * @author wuyj
 * @date 2021/12/27 9:54 下午
 *
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 *
 * 实现 MyQueue 类：
 *
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 *
 * 说明：
 *
 * 你只能使用标准的栈操作 —— 也就是只有push to top,peek/pop from top,size, 和is empty操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 *
 */
public class MyQueue {
    LinkedList<Integer> statck1;
    LinkedList<Integer> statck2;
    public MyQueue() {
        statck1 = new LinkedList<>();
        statck2 = new LinkedList<>();
    }

    public void push(int x) {
        statck1.push(x);
    }

    public int pop() {
        while (statck2.isEmpty()){
            while (!statck1.isEmpty()){
                statck2.push(statck1.pop());
            }
        }
        return statck2.poll();
    }

    public int peek() {
        while (statck2.isEmpty()){
            while (!statck1.isEmpty()){
                statck2.push(statck1.pop());
            }
        }
        return statck2.peek();
    }

    public boolean empty(){
        return statck1.isEmpty() && statck2.isEmpty();
    }

}
