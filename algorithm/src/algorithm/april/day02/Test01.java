package algorithm.april.day02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wuyj
 * @date 2022/4/8 9:15 下午
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class Test01 {


    /**
     * 暴力解法
     * @param nums
     * @return
     */
    public int[] sortedSquares1(int[] nums) {
        int [] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] * nums[i];
        }
        Arrays.sort(newArr);
        return newArr;
    }


    /**
     * 双指针
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int [] newArr = new int[nums.length];
        for (int i = 0,j = nums.length-1,k = nums.length-1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]){
                newArr[k] = nums[i] * nums[i];
                i++;
            }else {
                newArr[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return newArr;
    }
}
