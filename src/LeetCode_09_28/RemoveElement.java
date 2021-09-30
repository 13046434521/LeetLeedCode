package LeetCode_09_28;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/9/28 16:32
 * 题目：27. 移除元素
 * 网址：https://leetcode-cn.com/problems/remove-element/
 * 思路：前后指针移动问题。
 * 状态：完成
 */

class RemoveElement {
   public static int removeElement(int[] nums, int val) {
      int res = 0;
      int start = 0;
      int end = nums.length-1;
      while (start<=end){
         if (nums[start]==val&&nums[end]!=val){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            res++;
         }else if (nums[start]==val&&nums[end]==val){
            end--;
            res++;
            continue;
         }

         start++;
      }

      return nums.length-res;
   }

   public static void main(String[] args) {
      int [] test = new int[]{0,1,2,2,3,0,4,2,2};

      System.out.println(removeElement(test, 2)+"\n"+ Arrays.toString(test));
   }
}
