package algorithm.day02;

/**
 * 找出一个数组中出现奇数次的数
 *
 * 数组中只有一个数是奇数次，其余均为偶数次
 *
 * @author wuyj
 * @date 2021/11/11 9:36 下午
 */
public class Test01 {

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,8,8,4,4,4,4};
        int oneNum = getOneNum(arr);
        System.out.println(oneNum);
    }

    /**
     * 主要思想:
     * 任何数异或0都是任何数
     * 两数相等，互相异或为0
     * @param arr
     * @return
     */
    public static int getOneNum(int [] arr){
        int epm = 0;
        for (int i = 0; i < arr.length; i++) {
            epm = epm ^ arr[i];
        }
        return epm;
    }
}
