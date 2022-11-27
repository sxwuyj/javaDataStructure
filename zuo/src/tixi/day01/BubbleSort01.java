package tixi.day01;

/**
 * @author wuyj
 * @date 2022/11/27 21:23
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,0,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
