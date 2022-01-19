package algorithm.day08;

import java.util.HashMap;

/**
 * @author wuyj
 * @date 2021/12/24 10:40 下午
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class Test01 {

    public static void main(String[] args) {

    }

    /**
     * 借助hash
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        //维护字符和次数关系
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (!map.containsKey(aChar)){
                map.put(aChar,1);
            }else {
                map.put(aChar,map.get(aChar)+1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
