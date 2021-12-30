package com.wuyj.algorithm.day05;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wuyj
 * @date 2021/12/21 11:16 下午
 * <p>
 * 给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致
 * （如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 */
public class Test01 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        intersect2(nums1, nums2);
    }

    /**
     * hash映射解法
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect1(int[] nums1, int[] nums2) {
        //找到最大的数组
        if (nums2.length > nums1.length) {
            return intersect1(nums2, nums1);
        }
        int[] newArray = new int[nums1.length];
        int index = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer orDefault = map1.getOrDefault(nums1[i], 0) + 1;
            map1.put(nums1[i],orDefault);
        }
        for (int num2 : nums2) {
            if (map1.containsKey(num2) && map1.get(num2) > 0) {
                map1.put(num2, map1.get(num2) - 1);
                newArray[index] = num2;
                index++;
            } else {
                map1.remove(num2);
            }
        }
        return Arrays.copyOfRange(newArray, 0, index);
    }

    /**
     * 排序+双指针
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect2(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] newArray = new int[Math.min(nums1.length,nums2.length)];
        while (index1 < nums1.length && index2 < nums2.length){
            if (nums1[index1] == nums2[index2]){
                newArray[index3] = nums1[index1];
                index1++;
                index2++;
                index3++;
            }else if (nums1[index1] > nums2[index2]){
                index2++;
            }else if (nums2[index2] > nums1[index1]){
                index1++;
            }
        }
        return Arrays.copyOfRange(newArray, 0, index3);
    }
}
