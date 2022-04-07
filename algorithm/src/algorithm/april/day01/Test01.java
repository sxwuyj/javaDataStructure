package algorithm.april.day01;

/**
 * @author wuyj
 * @date 2022/4/7 8:45 上午
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 */
public class Test01 {

    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int target = getTarget(arr, 3);
        System.out.println(target);
    }

    /**
     * 暴力解法
     * @param arr
     * @param target
     * @return
     */
    public static int getTarget1(int[] arr, int target){
        int result = -1;
        if (null == arr || arr.length <= 0){
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target ){
                result = i;
                return result;
            }
        }
        return result;
    }

    /**
     * 双指针
     * @param arr
     * @param target
     * @return
     */
    public static int getTarget(int[] arr, int target){
        int result = -1;
        if (null == arr || arr.length <= 0){
            return result;
        }
        int heard = 0 ;
        int last = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (heard > last){
                return result;
            }
            if (arr[heard] == target){
                return heard;
            }
            if (arr[last] == target){
                return last;
            }
            heard ++;
            last --;
        }
        return result;
    }
}
