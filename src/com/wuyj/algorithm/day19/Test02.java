package com.wuyj.algorithm.day19;

/**
 * @author wuyj
 * @date 2022/1/4 8:14 下午
 * 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像
 *
 */
public class Test02 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //对角反转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //左右反转
        for (int i = 0; i < n; i++) {
            for (int j = 0,k = n-1;j<k;j++,k--){
                int temp = matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}
