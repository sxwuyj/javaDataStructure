package algorithm.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wuyj
 * @date 2022/1/2 8:30 下午
 *
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 思路
 *      排序后去重
 *      双指针降低时间复杂度
 */
public class Test03 {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                break;
            }
            if (i > 0  && nums[i] == nums[i-1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while (l < r && nums[r] == nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if (sum < 0){
                    l++;
                }else if (sum > 0){
                    r--;
                }
            }
        }
        return ans;
    }
}
