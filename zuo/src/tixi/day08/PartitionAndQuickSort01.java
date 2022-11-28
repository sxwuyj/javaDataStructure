package tixi.day08;

/**
 *
 * 荷兰国旗问题
 *
 * 1)一个数组分成两个区域
 *  当前数<= 目标数
 *  当前数> 目标数
 *
 * @author wuyj
 * @date 2022/11/28 23:09
 */
public class PartitionAndQuickSort01 {

    public static void main(String[] args) {
        int [] arr = {1,5,9,2,8,7,4,0,3};
        partition(arr,0,arr.length-1);
    }

    private static int partition(int[] arr, int l, int r) {
        if (l < r) {
            return -1;
        }
        if (l == r){
            return l;
        }
        int index = 0;
        int lessEqual = l - 1;
        while (index < r){
            if (arr[index] <= arr[r]){
                swap(arr,++lessEqual,index);
            }
            index++;
        }
        swap(arr,++lessEqual,r);
        return lessEqual;
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
