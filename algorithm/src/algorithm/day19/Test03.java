package algorithm.day19;

/**
 * @author wuyj
 * @date 2022/1/4 9:21 下午
 *
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix
 */
public class Test03 {

    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, down = n - 1;

        while (left <= right && top <= down){
            //从左上到右上,第一行填充
            for (int column = left; column <= right; column++) {
                 matrix[top][column] = num;
                 num++;
            }
            //从右上到右下,最后一列填充
            for (int row = top+1; row <= down; row++) {
                matrix[row][right] = num;
                num++;
            }
            if (left < right && top < down){
                //从右下到左下,最后一行
                for (int column = right-1; column > left; column--) {
                    matrix[down][column] = num;
                    num++;
                }
                for (int row = down; row > top; row--) {
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            down--;
        }
        return matrix;
    }
}
