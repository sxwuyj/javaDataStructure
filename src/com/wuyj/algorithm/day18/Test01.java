package com.wuyj.algorithm.day18;

/**
 * @author wuyj
 * @date 2022/1/3 10:09 下午
 *
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 */
public class Test01 {

    public void sortColors(int[] nums) {
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre] = temp;
                ++pre;
            }
        }

        for (int i = pre; i < nums.length; i++) {
            if (nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre] = temp;
                ++pre;
            }
        }
    }


    public void sortColors1(int[] nums) {
        int p1 = 0;
        int p2 = nums.length-1;
        for (int i = 0; i <= p2; ++i) {
            while (i <=p2 && nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                ++p1;
            }
        }
    }
}
