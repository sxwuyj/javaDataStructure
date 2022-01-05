package com.wuyj.algorithm.day20;

/**
 * @author wuyj
 * @date 2022/1/5 4:55 下午
 *
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 */
public class Test01 {

    public static void main(String[] args) {
        int [][]arr = {{1,1}};
        System.out.println(searchMatrix(arr, 2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int row = 0;
            int column = matrix[i].length-1;
            while (row < matrix.length && column >=0){
                if (matrix[row][column] < target){
                    row++;
                }else if (matrix[row][column] > target){
                    column--;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
