package LeetCode_10_21;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/10/21 17:55
 * 题目：231. 2 的幂
 * 网址：https://leetcode-cn.com/problems/power-of-two/
 * 思路：二进制位移。int 取值范围。
 * 状态：
 */

class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        for (int i=0;i<31;i++){
            if(n==(1<<i)){
                return true;
            }
        }

        return false;
    }
}
