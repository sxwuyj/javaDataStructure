package com.wuyj.algorithm.day11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author wuyj
 * @date 2021/12/27 9:25 下午
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 */
public class Test01 {

    public boolean Solution(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                stack.poll();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
