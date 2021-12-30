package com.wuyj.algorithm.day08;

/**
 * @author wuyj
 * @date 2021/12/24 11:17 下午
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 *
 */
public class Test03 {

    public static void main(String[] args) {
        isAnagram("qweqweq","gggssss");
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] tables = new int[26];
        for (int i = 0; i < s.length(); i++) {
            tables[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tables[t.charAt(i)-'a']--;
            if (tables[t.charAt(i)-'a'] <0){
                return false;
            }
        }
        return true;
    }
}
