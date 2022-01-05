package com.wuyj.algorithm.day20;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wuyj
 * @date 2022/1/5 7:25 下午
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 *
 * 注意:
 *
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 *
 */
public class Test02 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int n = intervals.length;
        int ans = 1;
        int right = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= right){
                right = intervals[i][1];
                ans++;
            }
        }
        return n-ans;
    }
}
