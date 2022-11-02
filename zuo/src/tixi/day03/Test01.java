package tixi.day03;

/**
 * @author wuyj
 * @date 2022/11/2 22:19
 *
 * 如何不用额外空间交换两个数
 *
 *
 */
public class Test01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a  ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+"===="+b);
    }
}
