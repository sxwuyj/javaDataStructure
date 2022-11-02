package tixi.day03;

/**
 * @author wuyj
 * @date 2022/11/2 22:35
 *
 * 在一个数组中,只有一个数字出现了奇数次,其他数字出现了偶数次
 * 找到这个数
 */
public class Test02 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,3,5,5,6,6};
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }
        System.out.println(eor);
    }
}
