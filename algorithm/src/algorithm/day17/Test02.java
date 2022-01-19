package algorithm.day17;

import java.util.Arrays;

/**
 * @author wuyj
 * @date 2022/1/2 8:12 下午
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 n/2 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 优化:
 *      排序改为堆排序
 */
public class Test02 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
