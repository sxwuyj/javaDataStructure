package algorithm.april.day02;

/**
 * @author wuyj
 * @date 2022/4/8 9:30 下午
 */
public class Test02 {

    /**
     * 使用额外的数组
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int [] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(newArr,0,nums,0,nums.length);
    }

    /**
     * 反转数组
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start +=1;
            end -=1;
        }
    }

}
