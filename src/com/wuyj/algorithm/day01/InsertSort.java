package com.wuyj.algorithm.day01;

import java.util.Arrays;

/**
 * 插入排序
 * @author wuyj
 * @date 2021/11/11 8:15 下午
 */
public class InsertSort {

    public static void main(String[] args) {
        generate();
    }
    /**
     * 插入算法实现
     * @param arr 目标数组
     */
    public static void insertSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                //交换
                int tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
            }
        }
    }



    /**
     * 对数器
     *
     * @return
     */
    public static void generate() {
        //定义测试次数
        int testTime = 10000;
        //定义最大数组
        int maxSize = 500;
        //定义数组最大值，正负100
        int maxValue = 100;
        //默认不通过
        boolean succeed = false;
        for (int i = 0; i < testTime; i++) {
            //获取一个完全随机数组
            int[] arr = generateRandomArray(maxSize, maxValue);
            //复制两份出来不通方式排序
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            //自己实现的冒泡排序
            insertSort(arr1);
            //JDK排序算法
            Arrays.sort(arr2);
            //对比两个数组是否完全一致
            if (!isEqual(arr1,arr2)){
                succeed = false;
                break;
            }
            succeed = true;
        }
        System.out.println(succeed ? "恭喜你，完全正确！！！":"非常抱歉，测试未能通过！！！");
    }


    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 生成一个完全随机的数组
     *
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - ((int) (maxValue * Math.random()));
        }
        return arr;
    }

    /**
     * 复制一个数组
     *
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
