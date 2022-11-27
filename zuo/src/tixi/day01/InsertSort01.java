package tixi.day01;

/**
 * @author wuyj
 * @date 2022/11/27 21:40
 */
public class InsertSort01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 6, 9, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j>= 0  &&arr[j] > arr[j + 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
