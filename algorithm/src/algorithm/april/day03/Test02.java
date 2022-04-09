package algorithm.april.day03;

/**
 * @author wuyj
 * @date 2022/4/9 8:39 下午
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * <p>
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * <p>
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 */
public class Test02 {

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        twoSum(arr,9);
    }
    /**
     * 双指针
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] arr = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return arr;
    }

    /**
     * 二分+双指针
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2 ;
            if (numbers[mid] + numbers[left] > target) {
                right = mid - 1;
            } else if (numbers[mid] + numbers[right] < target) {
                left = mid + 1;
            } else if (numbers[left] + numbers[right] > target) {
                right = right - 1;
            } else if (numbers[left] + numbers[right] < target) {
                left = left + 1;
            } else {
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }
}

