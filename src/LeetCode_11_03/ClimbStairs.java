package LeetCode_11_03;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/11/3 10:52
 * 题目：70. 爬楼梯
 * 网址：https://leetcode-cn.com/problems/climbing-stairs/
 * 思路：动态规划
 * 状态：完成
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */

class ClimbStairs {
    public int climbStairs(int n) {
        int[] dpTable = new int [n+1];
        Arrays.fill(dpTable,-1);
        return dp(n,dpTable);
    }

    public int dp(int n, int[] dpTable) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (dpTable[n] != -1) {
            return dpTable[n];
        }

        int res = dp(n - 2,dpTable) + dp(n - 1,dpTable);
        dpTable[n] = res;
        return res;
    }

    /**
     * 第二种解法
     * @param n
     * @return
     */
    public int climbStairsII(int n) {
        int[] dpTable = new int [n+1];
        dpTable[0] = 1;
        dpTable[1] = 1;

        for (int i = 2;i<=n;i++){
            dpTable[i] = dpTable[i-1]+dpTable[i-2];
        }
        return dpTable[n];
    }
}
