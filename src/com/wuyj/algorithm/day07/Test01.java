package com.wuyj.algorithm.day07;

/**
 * @author wuyj
 * @date 2021/12/23 10:50 下午
 *
 * 36. 有效的数独
 */
public class Test01 {

    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        //行
        int[][] rows = new int[9][9];
        //列
        int[][] columns = new int[9][9];
        //小数独
        int[][][] subboxes = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //取出对应位置的元素
                char c = board[i][j];
                if (c != '.'){
                    int index = c - '0' - 1;
                    //次数加1
                    rows[i][index]++;
                    //次数加1
                    columns[j][index]++;
                    //次数加1
                    subboxes[i/3][j/3][index/3]++;
                    if ( rows[i][index] > 1 ||
                        columns[j][index] >1 ||
                            subboxes[i / 3][j / 3][index] > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
