package sx_wuyj.queue;

/**
 * @author sx_wuyj
 * @version 1.0.0
 * @ClassName ArrQueue.java
 * @Description 使用数组模拟一个队列，也就是队列类
 * @createTime 2019年06月22日 21:12:00
 */
public class ArrQueue {
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
    private int [] arr;

    /**
     * 创建队列的构造
     */
    public ArrQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int [maxSize];
        front = -1; //指向队列头部，指向队列头部数据的前一个位置
        rear = -1;  //指向队列尾部，指向队列尾部数据，就是最后一个数据
    }

    /**
     * 判断队列是否满
     */
    public boolean isFull(){
        return rear == maxSize-1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isNull(){
        return front == rear;
    }

    /**
     * 添加数据到队列
     */
    public void addQueue(int data) {
        //判断队列是否满
        if (isFull()){
            throw new RuntimeException("队列已满");
        }
        arr[++rear] = data;
    }

    /**
     * 取出队列数据
     */
    public int getQueueData(){
        //判断队列是否为空
        if (isNull()){
            throw new RuntimeException("队列为空");
        }
        return arr[++front];
    }

    /**
     * 显示队列所有数据
     */
    public void showQueue(){
        //判断队列是否为空
        if (isNull()){
            throw new RuntimeException("队列为空");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    /**
     * 查看队列头部数据，只是看，不取
     */
    public int headData(){
        //判断是否为空
        if (isNull()){
            throw new RuntimeException("队列为空");
        }
        return arr[++front];
    }
}
