package algorithm.april.day04;

/**
 * @author wuyj
 * @date 2022/4/10 9:51 下午
 *
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        reverseWords(str);
    }

    public static String reverseWords(String s) {
        StringBuffer str = new StringBuffer();
        int i = 0;
        while (i < s.length()){
            int start = i;
            while (i < s.length() && s.charAt(i) != ' '){
                i++;
            }
            for (int p = start; p < i; p++) {
                str.append(s.charAt(start + i - 1 - p));
            }
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
                str.append(' ');
            }
        }
        return str.toString();
    }


    public  String reverseWords1(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int start = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' '){
                reverse(chars,start,i-1);
                start = i+1;
            }
        }
        reverse(chars,start,length-1);
        return new String(chars);
    }

    public  void reverse(char[] s,int left,int right) {
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
