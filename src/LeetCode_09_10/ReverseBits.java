package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 17:39
 * 题目：190. 颠倒二进制位
 *
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 * 网址： https://leetcode-cn.com/problems/reverse-bits/
 * 思路：位运算。取最低位进行与操作，在左移至相应位置。注意操作符的先后顺序。
 * 1. ()
 * 2. +,-,*,%
 * 3. >>  <<
 * 4. > >= <= <
 * 5. ==  !=
 * 6. & ^ | && ||
 * 7. = +=
 * 做完：正确
 */

class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            res += (n >> i & 1) << (31 - i);
        }

        return res;
    }
}
