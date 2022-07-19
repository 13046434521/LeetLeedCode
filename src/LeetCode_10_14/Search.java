package LeetCode_10_14;

/**
 * @author jtl
 * @date 2021/10/14 16:52
 * 题目：704. 二分查找
 * 网址：https://leetcode-cn.com/problems/binary-search/
 * 思路：取中间值。小于目标值，则缩小左边界、大于目标值，缩小右边界。
 * 状态：完成
 */

class Search {
   public int search(int[] nums, int target) {
      int start = 0;
      int end = nums.length-1;
      while (start<=end) {
         int middle = start + ((end - start) >> 1);
         int temp = nums[middle];
         if (temp < target) {
            start = middle + 1;
         } else if (temp > target) {
            end = middle - 1;
         } else {
            return middle;
         }
      }

      return -1;
   }
}
