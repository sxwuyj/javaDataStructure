package tixi.day03;

/**
 * @author wuyj
 * @date 2022/11/2 22:45
 * 一个数组中有一种树出现了K次,其他数出现了M次
 * M>1,K<M
 * 找到出现了K次的数
 *
 * 空间复杂度O(1)
 */
public class Test04 {


    public static void main(String[] args) {
        int [] arr = {6,10,6,6,4,4,12,12,12,12,3,3};
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        int rightOne = eor & -eor;
        int onlyOne = 0;
        for (int i = 0;i < arr.length; i++) {
            if ((arr[i] & rightOne) !=0){
                onlyOne ^= arr[i];
            }
        }
        int k = onlyOne ^ eor;
        System.out.println(onlyOne+"--"+k);
    }
}
