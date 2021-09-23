package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 16:04
 * 题目：7. 整数反转
 * 网址：https://leetcode-cn.com/problems/reverse-integer/
 * 思路：取余数。注意Integer的最大范围。
 * 做完：通过
 */

class Reverse {
    public static int reverse(int x) {
        long res = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp = temp / 10;

        }
        res = x>0?res:-res;

        if (res>Math.pow(2,31)-1||res<-Math.pow(2,31)){
            res = 0;
        }

        return  (int)res;
    }
}
