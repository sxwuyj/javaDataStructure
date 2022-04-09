package algorithm.april.day03;

import java.util.Arrays;

/**
 * @author wuyj
 * @date 2022/4/9 8:18 下午
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class Tes01 {

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    /**
     * 快慢指针
     * 思路
     * 右指针不断右移,遇到非0数将左右指针交换,并且左指针右移;
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
       int left = 0,right = 0;
       while (right < nums.length){
           if (nums[right] != 0){
               swap(nums,left,right);
               left++;
           }
           right++;
       }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
