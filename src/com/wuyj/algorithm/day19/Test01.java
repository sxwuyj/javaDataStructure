package com.wuyj.algorithm.day19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyj
 * @date 2022/1/4 7:58 下午
 *
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class Test01 {

    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j == i){
                    row.add(1);
                }else {
                    row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list.get(rowIndex);
    }
}
