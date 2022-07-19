/**
 * @author jtl
 * @date 2021/11/4 16:22
 * 题目：367. 有效的完全平方数
 * 网址：https://leetcode-cn.com/problems/valid-perfect-square/solution/you-xiao-de-wan-quan-ping-fang-shu-by-le-wkee/
 * 思路：暴力穷举
 * 状态：完成
 *
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 */

class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int temp = 1;
        int n = 1;
        while(temp<=num && temp>0){
            if(temp==num){
                return true;
            }
            temp = n*n;
            n++;
        }

        return false;
    }
}
