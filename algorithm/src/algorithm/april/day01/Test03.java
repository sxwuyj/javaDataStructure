package algorithm.april.day01;

/**
 * @author wuyj
 * @date 2022/4/7 9:09 下午
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 */
public class Test03 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        searchInsert(arr,5);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<= right){
            int mid = left + (right - left) / 2;
            if (target == nums[mid]){
                return mid;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else if (target < nums[mid]){
                right = mid - 1;
            }

        }
        return left;
    }
}
