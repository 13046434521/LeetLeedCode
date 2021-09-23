package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 16:33
 * 题目：231. 2 的幂
 * 网址：https://leetcode-cn.com/problems/power-of-two/
 * 思路：遍历2的次方
 * 状态：完成
 */

class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // 保证res和n不相等
        double res = n-1;
        int i = 0;
        while (res<n){
            res = Math.pow(2,i++);
        }

        return res == n;
    }
}
