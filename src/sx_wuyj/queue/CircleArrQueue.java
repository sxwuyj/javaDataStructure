package sx_wuyj.queue;

/**
 * @author sx_wuyj
 * @version 1.0.0
 * @ClassName CircleArrQueue.java
 * @Description 环形数组模拟队列
 * @createTime 2019年06月23日 21:05:00
 */
public class CircleArrQueue {

    /**
     * 队列的最大值
     */
    private int maxSize;
    /**
     * 队列头
     */
    private int front;
    /**
     * 队列尾
     */
    private int rear;
    /**
     * 数组，模拟队列，存放数据
     */
    private int[] arr;

    public CircleArrQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 盘对队列是否为空
     */
    public boolean isNull() {
        return rear == front;
    }

    /**
     * 添加数据
     */
    public void add(int data) {
        if (isFull()) {
            throw new RuntimeException("数组已满");
        }
        arr[rear] = data;
        rear = (rear + 1) % maxSize;
    }

    /**
     * 获取队列数据
     */
    public int getQueue() {
        if (isNull()) {
            throw new RuntimeException("数组为空");
        }
        int value = arr[front];
        front = (front+1)%maxSize;
        return value;
    }

    /**
     * 显示所有数据的方法
     */
    public void show(){
        if (isNull()){
            throw new RuntimeException("数组为空");
        }
        for (int i = front; i < front+getSize(); i++) {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }

    /**
     * 有效数据的个数
     */
    public int getSize(){
        return (rear+maxSize-front) % maxSize;
    }
}
