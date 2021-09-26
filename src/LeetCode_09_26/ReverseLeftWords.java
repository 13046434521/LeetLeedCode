package LeetCode_09_26;

/**
 * @author jtl
 * @date 2021/9/24 18:50
 * 题目：剑指 Offer 58 - II. 左旋转字符串
 * 网址：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * 思路：substring的用法，第一个为起始下标a。第二个为目标下标位置b。截取的字符是a--b之间的字符。
 * 状态：完成
 */

class ReverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String aa= "jiatianlong";

        System.out.println(reverseLeftWords(aa, 3));
    }
}
