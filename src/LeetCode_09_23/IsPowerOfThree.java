package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 18:14
 * 题目：326. 3的幂
 * 网址：https://leetcode-cn.com/problems/power-of-three/
 * 思路：遍历3的幂，找到第一个不大于n的三的幂数。如果这个数和n相等。就返回true，否则返回false
 * 状态：
 */

class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        // 保证res和n不相等
        double res = n-1;
        int i = 0;
        while (res<n){
            res = Math.pow(3,i++);
        }

        return res==n;
    }
}
