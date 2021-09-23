package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 11:25
 * 题目：557. 反转字符串中的单词 III
 *       给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 网址：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * 思路：快慢指针。遇到空格和结尾之间的字符进行反转。
 * 做完：做完
 */

class ReverseWord {
    public  String reverseWords(String s) {
        char[] data = s.toCharArray();
        int slow = 0;
        int fast = 0;
        for (int i=0;i<data.length;i++) {
            if (data[i]==' '){
                reverseString(data,slow,fast);
                slow = i+1;
            }

            fast=i;
        }

        reverseString(data,slow,fast);

        return new String(data);
    }

    public  void reverseString(char[] data, int start, int end) {
        while (start < end) {
            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;

            start++;
            end--;
        }
    }
}
