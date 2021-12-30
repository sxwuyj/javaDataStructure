package com.wuyj.algorithm.day08;

import java.util.HashMap;

/**
 * @author wuyj
 * @date 2021/12/24 11:01 下午
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次
 *
 */
public class Test02 {

    public static void main(String[] args) {

    }

    /**
     * hash映射
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        HashMap<Character, Integer> maMap = new HashMap<>();
        for (char magazineChar : magazineChars) {
            if (!maMap.containsKey(magazineChar)){
                maMap.put(magazineChar,1);
            }else {
                maMap.put(magazineChar,maMap.get(magazineChar)+1);
            }
        }
        char[] raChars = ransomNote.toCharArray();
        for (char raChar : raChars) {
            if (maMap.containsKey(raChar) && maMap.get(raChar) >0){
                maMap.put(raChar,maMap.get(raChar)-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
