package tixi.day02;

/**
 * @author wuyj
 * @date 2022/11/1 23:53
 *
 * 找到一个有序数组中目标值出现最左侧的位置
 */
public class Test02 {

    public static void main(String[] args) {
        int [] arr = {1,3,2,8,6,9,0};
        System.out.println(Test02.getIndex(arr, 3));
    }
    public static int getIndex(int[] arr,int target){
        int mid = 0;
        int r = arr.length-1;
        int l = 0;
        int index = 0;

        while (l<=r){
            mid = l + ((r - l) >> +1);
            if (arr[mid] >= target){
                index = mid;
                r = mid - 1;
            }else {
                l = mid +1;
            }
        }
        return index;
    }
}
