package tixi.day10;

import tixi.common.utils.ArrSwapUtil;

/**
 * @author wuyj
 * @date 2022/12/3 16:53
 */
public class HeapSort02 {


    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 7, 0, 2};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void heapSort(int[] arr) {

        for (int i = arr.length-1; i >= 0 ; i--) {
            heapIfy(arr,i,arr.length);
        }
        int headSize = arr.length;
        ArrSwapUtil.swap(arr,0,--headSize);
        while (headSize > 0 ){
            heapIfy(arr,0,headSize);
            ArrSwapUtil.swap(arr,0,--headSize);
        }
    }

    private static void heapIfy(int[] arr, int index, int headSize) {
        int left = index * 2 + 1;
        while (left < headSize){
            int maxIndex = left + 1 < headSize && arr[left +1 ] > arr[left] ? left +1 : left;
            maxIndex = arr[index] > arr[maxIndex] ? index : maxIndex;
            if (index == maxIndex){
                break;
            }
            ArrSwapUtil.swap(arr,index,maxIndex);
            index = left;
            left = left * 2 + 1;
        }
    }
}
