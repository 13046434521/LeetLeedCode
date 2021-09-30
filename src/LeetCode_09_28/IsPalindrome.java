package LeetCode_09_28;

/**
 * @author jtl
 * @date 2021/9/28 16:53
 * 题目：9. 回文数
 * 网址：https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode-solution/
 * 思路：前后指针移动。
 * 状态：完成
 */

class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        int start = 0;
        int end =s1.length()-1;

        while(start<=end){
            if (s1.charAt(start) != s1.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
