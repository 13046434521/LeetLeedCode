package LeetCode_09_27;

import java.util.ArrayList;

/**
 * @author jtl
 * @date 2021/9/27 14:22
 * 题目：剑指 Offer 50. 第一个只出现一次的字符
 * 网址：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * 思路：Ansc码 数组下标
 * 状态：完成
 */

class FirstUniqChar {
    public static char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        char[] data = new char[26];

        for (int i = 0; i < chars.length; i++) {
            data[chars[i] - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (data[chars[i] - 'a'] == 1) {
                return chars[i];
            }
        }
        return ' ';
    }


    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
