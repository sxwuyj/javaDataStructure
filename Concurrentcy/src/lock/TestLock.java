package lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wuyj
 * @date 2022/11/23 22:50
 */
public class TestLock {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("执行业务");
        } finally {
            lock.unlock();
        }
    }
}
