package tixi.day06;

/**
 * @author wuyj
 * @date 2022/11/14 23:43
 * <p>
 * 归并排序---迭代
 */
public class Test02 {

    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int l = 0;
        int mergerSize = 1;
        int n = arr.length;
        while (l < n) {
            int m = l + mergerSize - 1;
            if (m >= n) {
                break;
            }
            int r = Math.min(m + mergerSize, n - 1);
            merge(arr,l,m,r);
            l = r + 1;

            if (mergerSize > n / 2){
                break;
            }
            mergerSize = mergerSize << 1;
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int [] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        if (p1 <= m && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m){
            help[i++] = arr[p1++];
        }
        while (p2 <= r){
            help[i++] = arr[p2++];
        }
        for (int i1 = 0; i1 < help.length; i1++) {
            arr[l+i] = help[i1];
        }
    }
}
