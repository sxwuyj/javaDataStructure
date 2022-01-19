package algorithm.day03;

import java.util.HashSet;

/**
 * @author wuyj
 * @date 2021/12/19 10:42 下午
 *
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Test01 {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return  true;
            }
        }
        return false;
    }
}
