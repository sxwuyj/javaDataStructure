package tixi.day07;

/**
 * @author wuyj
 * @date 2022/11/27 22:56
 */
public class SmallSum {

    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        System.out.println(process(arr, 0, arr.length - 1));
    }

    private static int process(int[] arr, int l, int r) {
        if (l == r){
            return 0;
        }
        int mid = l + ((r-l) >> 1);
        return process(arr,l,mid)
                +
                process(arr,mid+1,r)
                +
                merge(arr,mid,l,r);
    }

    private static int merge(int [] arr,int mid,int l,int r){
        int [] help = new int[r -l +1];
        int i = 0;
        int p1 = l;
        int p2 = mid +1;
        int res = 0;
        while (p1<= mid && p2 <= r){
            res += arr[p1] < arr[p2] ? (r - p2 + 1 ) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1 ++ ];
        }
        while (p2 <= r){
            help[i++] = arr[p2 ++ ];
        }
        for (int i1 = 0; i1 < help.length; i1++) {
            arr[l + i1] = help[i1];
        }
        System.out.println(res);
        return res;
    }
}
