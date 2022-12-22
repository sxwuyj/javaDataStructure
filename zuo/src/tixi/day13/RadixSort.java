package tixi.day13;

/**
 * @author wuyj
 * @date 2022/12/22 22:21
 */
public class RadixSort {

    public static void main(String[] args) {
        int [] arr = {100,103,015,027};

        radixSort(arr,0,arr.length, maxBits(arr));
    }


    private static void radixSort(int[] arr, int l, int r, int maxBit) {
        final int radix = 10;
        int i = 0 ,j = 0;
        int [] help = new int[r-l+1];

        for (int d = 1; d <= maxBit; d++) {
           int [] count = new int[radix];
            for (i = 1; i < radix; i++) {
                j = getDigit(arr[i],radix);
                count[j]++;
            }

            for (i = 1; i < radix; i++) {
                count[i] = count[i] + count[i-1];
            }

            for (i =r; i >= l;i--){
                j = getDigit(count[i],radix );
                help[count[j-1]] = arr[i];
                count[j]--;
            }

            for (i = 0; i < count.length; i++) {
                arr[i] = help[i];
            }
        }

    }

    private static int getDigit(int x, int d) {
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }

    private static int maxBits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        int res = 0;
        while (max != 0){
            res++;
            max = max / 10;
        }
        return res;
    }
}
