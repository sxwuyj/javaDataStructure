package tixi.day02;

/**
 * @author wuyj
 * @date 2022/11/1 23:46
 * <p>
 * 找到一个数组中目标值是否存在
 * <p>
 * 数组有序
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 6, 9, 0};
        System.out.println(Test01.isExit1(arr, 9));


    }

    public static boolean isExit(int[] arr, int target) {
        int mid = 0;
        int r = arr.length - 1;
        int l = 0;

        while (l < r) {
            mid = l + ((r - l) >> +1);
            if (arr[mid] == target) {
                return Boolean.TRUE;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            }
        }
        return arr[mid] == target;
    }


    public static boolean isExit1(int[] arr, int target) {
        int mid = 0;
        int l = 0;
        int r = arr.length - 1;

        while (r > l) {
            mid = l + ((r - l) >> +1);
            if (arr[mid] == target){
                return Boolean.TRUE;
            }else if (arr[mid] > target){
                r = mid - 1;
            }else if (arr[mid] < target){
                l = mid + 1;
            }
        }
        return arr[mid] == target;
    }











    public static boolean isExit2(int[] arr, int target) {
        int l = 0;
        int mid = 0;
        int r = arr.length -1;
        while (r > l){
            mid = l + ((r- l ) >> + 1);
            if (arr[mid] == target){
                return Boolean.TRUE;
            }else if (arr[mid] > target){
                r = mid -1 ;
            }else if (arr[mid] < target){
                l = mid + 1;
            }
        }
        return arr[mid ]  == target;

    }

    }
