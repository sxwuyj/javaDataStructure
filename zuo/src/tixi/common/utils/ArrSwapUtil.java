package tixi.common.utils;

/**
 * @author wuyj
 * @date 2022/12/2 22:30
 */
public class ArrSwapUtil {

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
