package tixi.day01;

/**
 * @author wuyj
 * @date 2022/10/31 23:18
 *
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {1,3,2,8,6,9,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
