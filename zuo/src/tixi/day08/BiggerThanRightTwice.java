package tixi.day08;

/**
 * @author wuyj
 * @date 2022/11/28 22:28
 *
 *
 * 2)一个数组分钟三个区域
 * 当前数 < 目标数
 * 当前数 == 目标数
 * 当前数 > 目标数
 */
public class BiggerThanRightTwice {

    public static void main(String[] args) {
        int [] arr = {1,2,4,7,3,5,22,0};
        process(arr,0,arr.length-1);
    }

    private static int process(int[] arr, int l, int r) {
        if (r == l){
            return 0;
        }
        int mid = l + (r-l >> 1);
        return process(arr,0,mid)
                +
                process(arr,mid,r)
                +
                merge(arr,mid,l,r);
    }

    private static int merge(int[] arr, int m, int l, int r) {

        int ans = 0;
        int windowR = m + 1;
        for (int i = 0; i < arr.length; i++) {
            while (windowR < r && arr[i] > arr[windowR] * 2){
                windowR++;
            }
            ans += r - windowR - 1;
        }
        int [] help = new int [r - l + 1];
        int p1 = l;
        int p2 = r;
        int i = 0;
        while (p1 <= m && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m){
            help[i++] = arr[p1++];
        }
        while (p2 <= r){
            help[i++] = arr[p2++];
        }

        for (int i1 = 0; i1 < help.length; i1++) {
            arr[l + i1] = help[i1];
        }
        return ans;
    }

}
