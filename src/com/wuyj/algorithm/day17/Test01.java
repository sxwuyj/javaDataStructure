package com.wuyj.algorithm.day17;

/**
 * @author wuyj
 * @date 2022/1/2 8:10 下午
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Test01 {

    public int singleNumber(int[] nums) {
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            z = nums[i] ^ z;
        }
        return z;
    }
}
