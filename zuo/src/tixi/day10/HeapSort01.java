package tixi.day10;

import tixi.common.utils.ArrSwapUtil;

/**
 * @author wuyj
 * @date 2022/12/3 15:54
 */
public class HeapSort01 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 7, 0, 2};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void heapSort(int [] arr){
        int heapSize = arr.length;
        for (int i = arr.length-1 ; i >= 0; i--) {
            heapIfy(arr,i,heapSize);
        }
        ArrSwapUtil.swap(arr,0,--heapSize);
        while (heapSize > 0){
            heapIfy(arr,0,heapSize);
            ArrSwapUtil.swap(arr,0,--heapSize);
        }
    }

    private static void heapInsert(int [] arr ,int index){
        while (arr[index] > arr[(index-1)/2]){
            ArrSwapUtil.swap(arr,index,index*2-1);
            index = (index-1)/2;
        }
    }

    private static void heapIfy(int [] arr,int index,int headSize){
        int left = index * 2 + 1;
        while (left < headSize){
            int largest = left + 1 < headSize && arr[left+1] > arr[left] ? left + 1 : left;
            largest = arr[index] > arr[largest] ? index : largest;
            if (index == largest){
                break;
            }
            ArrSwapUtil.swap(arr,index,largest);
            index = left;
            left = left * 2 + 1;
        }
    }
}
