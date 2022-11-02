package tixi.day03;

/**
 * @author wuyj
 * @date 2022/11/2 22:38
 *
 * 怎么把一个整型的数最右侧的1提取出来
 */
public class Test03 {

    public static void main(String[] args) {
        int a = 10;
        int b = a & -a;
        System.out.println(b);
    }
}
