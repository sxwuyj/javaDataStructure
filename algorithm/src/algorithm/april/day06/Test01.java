package algorithm.april.day06;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wuyj
 * @date 2022/4/12 10:22 下午
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Test01 {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int right = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0){
                occ.remove(s.charAt(i-1));
            }
            while (right + 1 < s.length() && !occ.contains(s.charAt(right + 1))){
                occ.add(s.charAt(right + 1));
                right ++;
            }
            ans = Math.max(ans,right-i+1);
        }
        return ans;
    }
}
