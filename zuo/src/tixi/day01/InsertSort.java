package tixi.day01;

/**
 * @author wuyj
 * @date 2022/10/31 23:51
 * <p>
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 6, 9, 0};
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
