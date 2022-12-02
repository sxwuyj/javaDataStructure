package tixi.day10;

import tixi.common.utils.ArrSwapUtil;

/**
 * @author wuyj
 * @date 2022/12/2 23:39
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 7, 0, 2};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void heapSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        ArrSwapUtil.swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapIfy(arr, 0, heapSize);
            ArrSwapUtil.swap(arr, 0, --heapSize);
        }


    }

    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            ArrSwapUtil.swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void heapIfy(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {

            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            ArrSwapUtil.swap(arr, index, largest);
            index = left;
            left = index * 2 + 1;
        }
    }
}
