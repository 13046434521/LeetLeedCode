package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 11:00
 * 题目：344. 反转字符串
 *       编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出
 * 网址：https://leetcode-cn.com/problems/reverse-string/
 * 思路：左右同时对调
 * 做完：正确
 */

class ReverseString {
   public void reverseString(char[] s) {
      int left = 0;
      int right = s.length-1;

      while (left < right) {
         char temp = s[left];
         s[left] = s[right];
         s[right] = temp;

         left++;
         right--;
      }
   }
}
