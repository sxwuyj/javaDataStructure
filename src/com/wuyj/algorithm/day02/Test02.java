package com.wuyj.algorithm.day02;

/**
 * 怎么找到一个int类型二进制最右侧的1
 *
 * @author wuyj
 * @date 2021/11/11 9:46 下午
 */
public class Test02 {

    /**
     * 主要思想：
     * 与运算
     * 任何数与自己相反数
     * @param args
     */
    public static void main(String[] args) {
        //二进制为 1010 == 10
        int i = 10;
        int j = i & -i;
        //输出2  0010 == 2
        System.out.println(j);

    }
}
