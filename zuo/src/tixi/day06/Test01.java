package tixi.day06;

/**
 * @author wuyj
 * @date 2022/11/14 22:35
 *
 * 递归---归并排序
 */
public class Test01 {


    public void sort(int [] arr,int l,int r){
        if (l == r){
            return;
        }
        int mid = l + ((r - l ) >> 1);
        sort(arr,l,mid);
        sort(arr,mid + 1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int [] help = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid +1;
        if (p1 <= mid && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1 +1] : arr[p2+1];
        }
        while (p1 <= mid){
            help[i++] = arr[p1 +1];
        }

        while (p2 <= r){
            help[i++] = arr[p2 +1];
        }

        for (int i1 = 0; i1 < help.length; i1++) {
            arr[l+1] = help[i1];
        }
    }
}
