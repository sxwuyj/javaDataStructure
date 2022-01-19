package algorithm.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyj
 * @date 2021/12/22 11:05 下午
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class Test02 {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        //整个杨辉三角
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            //杨辉三角每行的集合
            ArrayList<Integer> list = new ArrayList<>();
            //每行每个数生产
            for (int j = 0; j <= i; j++) {
               //,每行第一个和最后一个都为1
               if (j==0 || j==i){
                   list.add(1);
               }else {
                   //取上一行当前元素前一个和当前元素累加
                   //ret.get(i-1)  代表取上一行的集合
                   //get(j-1) 代表上一行集合中当前元素前一个位置的数
                   // ret.get(i-1).get(j)  因为上一行的前一个数加相邻的数为本行当前数
                   list.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
               }
            }
            ret.add(list);
        }
        return ret;
    }

}
