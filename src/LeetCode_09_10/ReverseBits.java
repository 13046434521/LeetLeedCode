package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 17:39
 * https://leetcode-cn.com/problems/reverse-bits/
 */

class ReverseBits {
   // you need treat n as an unsigned value
   public int reverseBits(int n) {
      StringBuilder stringBuilder = new StringBuilder();
      while (n%10!=0){
         int temp = n%10;
         stringBuilder.append(temp);
         n = n/10;
         if (n==0){
            break;
         }
      }
      return Integer.parseInt(stringBuilder.toString());
   }
}
