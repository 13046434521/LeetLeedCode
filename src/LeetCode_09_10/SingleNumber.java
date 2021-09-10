package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 17:35
 * https://leetcode-cn.com/problems/single-number/
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
