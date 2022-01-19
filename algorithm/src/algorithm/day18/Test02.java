package algorithm.day18;

import java.util.Arrays;

/**
 * @author wuyj
 * @date 2022/1/3 10:46 下午
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 */
public class Test02 {
    public int[][] merge(int[][] intervals) {
        //sort to get ordered array
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]){
                res[++idx] = interval;
            }else {
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
