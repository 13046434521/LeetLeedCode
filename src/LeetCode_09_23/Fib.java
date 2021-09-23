package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 16:50
 * 题目：剑指 Offer 10- I. 斐波那契数列
 * 0、1、1、2、3、5、8、13、21、34
 * 网址：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * 思路：两种解题思路。不推荐递归。题目加入了一个附加条件。在传统斐波那契数列上需做调整。
 * 状态：完成
 */

class Fib {
    public int fib(int n) {
        long fast = 1;
        long slow = 0;
        long i = 1;
        while (i < n) {
            long temp = fast;
            fast = temp + slow;
            slow = temp;
            if (fast >= 1000000007) {
                fast = fast % 1000000007;
            }
            i++;
        }

        return (int) fast;
    }

    public int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib2(n - 1) + fib2(n - 2);
    }
}
