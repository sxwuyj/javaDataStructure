package tixi.day08;

/**
 * @author wuyj
 * @date 2022/11/28 23:10
 *
 *  2)一个数组分钟三个区域
 * 当前数 < 目标数
 * 当前数 == 目标数
 * 当前数 > 目标数
 */
public class PartitionAndQuickSort02 {

    public static void main(String[] args) {
        int [] arr = {1,5,9,2,8,7,4,0,3};
        partition(arr,0,arr.length-1);
    }

    private static int[] partition(int[] arr, int l, int r) {

        int less = l -1;
        int more = r;
        int index = 0;
        while (index < r){
            if (arr[index] == arr[r]){
                index++;
            }else if (arr[index] < arr[r]){
                swap(arr,index++,++less);
            }else if (arr[index] > arr[r]){
                swap(arr,index++,--more);
            }
        }
        swap(arr,more,r);
        return new int[] {less + 1,more};
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
