package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 17:35
 * 题目： 136. 只出现一次的数字
 * 网址：https://leetcode-cn.com/problems/single-number/
 * 思路：所有数都进行一遍异或操作
 * 做完：正确
 */

class SingleNumber {
   public int singleNumber(int[] nums) {
      int result = 0;
      for (int i = 0; i < nums.length; i++) {
         result = nums[i]^result;
      }

      return result;
   }
}
