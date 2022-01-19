package algorithm.day02;

/**
 * 一个数组中有两种数出现了奇数次，其他数都出现了偶数次
 *
 * 规定 两种数不等
 *
 * 找到并打印这两种数
 *
 * @author wuyj
 * @date 2021/11/11 9:47 下午
 */
public class Test03 {

    /**
     * 主要思想：
     *
     * 所有数异或最后可得  两奇数异或
     *
     * 异或的结果与自己相反数进行与运算可得  两奇数异或结果二进制最右侧1
     *
     * 通过该特性可以将所有数分为两组
     *
     * 最右侧1的位置都为1   最右侧1的位置补位1
     * 此时，两个不等奇数必然被分到不通的组中
     * 因为他们不等，必然二进制上有一位是不等的，通过与运算可得这位
     * 对最右侧1的位置都为1的数进行异或运算
     * 利用异或特性可以定位到这两个奇数
     * @param args
     */
    public static void main(String[] args) {

        int [] arr = {1,2,2,3,3,8,4,4,4,4};
        //得两奇数异或的结果
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor = eor ^ arr[i];
        }
        //找到该数最右侧的1
        int i = eor & -eor;

        int y = 0;
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] & i) !=0){
                y = y ^ arr[j];
            }
        }
        System.out.println(y);
        System.out.println(y ^ eor);

    }
}
