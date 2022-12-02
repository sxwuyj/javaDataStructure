package tixi.day09;

/**
 * @author wuyj
 * @date 2022/11/30 23:19
 */
public class QuickSortV2 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,6,6,4,5,5,7,7,8};
        process(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void process(int[] arr, int l, int r) {
        if (l>=r){
            return;
        }
        int[] equal = netherLandsGlag(arr, l, r);
        process(arr,l,equal[0]-1);
        process(arr,equal[1]+1,r);
    }

    private static int [] netherLandsGlag(int[] arr, int l, int r) {
        if (l > r) { // L...R L>R
            return new int[] { -1, -1 };
        }
        if (l == r) {
            return new int[] { l, r };
        }
        //维护小于目标值的边界
        int less = l -1;
        //维护大于目标值的边界
        int more = r;
        //记录当前位置
        int index = l;
        while (index < more){
            if (arr[index] == arr[r]){
                index++;
            }else if (arr[index] > arr[r]){
                swap(arr,index++,--more);
            }else if (arr[index] < arr[r]){
                swap(arr,index++,++less);
            }
        }
        return new int[]{less+1,more};
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    private void process1(int [] arr,int l,int r){
        if (l >= r){
            return;
        }
        int[] intArr = netherLandsFlag(arr, l, r);
        process1(arr,l,intArr[0]-1);
        process1(arr,intArr[1]+1,r);
    }

    private int[] netherLandsFlag(int[] arr, int l, int r) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }
        if (l == r) {
            return new int[] { l, r };
        }
        int index = 0;
        int less = l - 1;
        int more = r;
        while (index < more) {
            if (arr[index] == arr[r]) {
                index++;
            } else if (arr[index] < arr[r]) {
                swap(arr, index++, ++less);
            } else if (arr[index] > arr[r]) {
                swap(arr, index++, --more);
            }
        }
        return new int[]{less + 1, more};
    }
}
