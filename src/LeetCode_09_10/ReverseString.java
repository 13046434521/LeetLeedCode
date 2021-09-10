package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 11:00
 * https://leetcode-cn.com/problems/reverse-string/
 */

class ReverseString {
   public void reverseString(char[] s) {
      int left = 0;
      int right = s.length-1;

      while (left<right){
         swap(s,left,right);
         left++;
         right--;
      }
   }


   public void swap(char[] data,int left,int right){
      char temp = data[left];
      data[left]=data[right];
      data[right] = temp;
   }
}
