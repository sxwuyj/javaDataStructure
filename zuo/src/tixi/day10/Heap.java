package tixi.day10;

import tixi.common.utils.ArrSwapUtil;

/**
 * @author wuyj
 * @date 2022/12/2 22:24
 */
public class Heap {

    private void heapInsert(int[] arr, int index) {

        while (arr[index] > arr[(index - 1) / 2]) {
            ArrSwapUtil.swap(arr, index, (index - 1) / 2);
            index = (index-1)/2;
        }
    }

    private void heapIfy(int[] arr, int index,int heapSize){
        int left = index * 2 + 1;
        while (left < heapSize){
            int largest = left+1 < heapSize && arr[left+1] > arr[left] ? left+1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index){
                break;
            }
            ArrSwapUtil.swap(arr,largest,index);
            index = left;
            left = index * 2 + 1;
        }
    }

}
