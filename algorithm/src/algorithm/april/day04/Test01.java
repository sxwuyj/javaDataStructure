package algorithm.april.day04;

/**
 * @author wuyj
 * @date 2022/4/10 9:43 下午
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 */
public class Test01 {

    /**
     * 头尾指针
     * @param s
     */
    public void reverseString(char[] s) {
        int left = 0,right = s.length-1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
