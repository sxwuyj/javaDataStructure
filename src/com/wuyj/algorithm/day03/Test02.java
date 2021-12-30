package com.wuyj.algorithm.day03;

/**
 * @author wuyj
 * @date 2021/12/19 11:14 下午
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 */
public class Test02 {
    public static void main(String[] args) {

    }


    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }
}
