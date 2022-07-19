package LeetCode_11_02;

/**
 * @author jtl
 * @date 2021/11/2 10:55
 * 题目：33. 搜索旋转排序数组
 * 网址：https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * 思路：
 * 状态：
 * 示例 1：
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 */

class Search {
   public int search(int[] nums, int target) {
      if(nums.length==1&&nums[0]!=target){
         return -1;
      }

      int k = findNum(nums);
      return 0;
   }

   public int findNum(int[] nums){



      return -1;
   }
}
