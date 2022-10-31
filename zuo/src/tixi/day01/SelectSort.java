package tixi.day01;

/**
 * @author wuyj
 * @date 2022/10/31 23:06
 *
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int [] arr = {1,3,2,8,6,9,0};
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                minIndex = arr[i] > arr[j] ? j : minIndex;
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
