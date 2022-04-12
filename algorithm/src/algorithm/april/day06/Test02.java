package algorithm.april.day06;

/**
 * @author wuyj
 * @date 2022/4/12 10:38 下午
 *
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 *
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 *
 */
public class Test02 {

    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : s1.toCharArray()) {
            cnt[c - 'a']++;
        }
        int[] cur = new int[26];
        for (int i = 0; i < m; i++) {
            cur[s2.charAt(i) - 'a']++;
        }
        if (check(cnt, cur)) {
            return true;
        }
        for (int i = m; i < n; i++) {
            cur[s2.charAt(i) - 'a']++;
            cur[s2.charAt(i - m) - 'a']--;
            if (check(cnt, cur)) {
                return true;
            }
        }
        return false;
    }
    boolean check(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
        }
        return true;
    }
}
