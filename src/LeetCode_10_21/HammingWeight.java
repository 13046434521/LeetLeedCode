package LeetCode_10_21;

/**
 * @author jtl
 * @date 2021/10/21 18:20
 * 题目：191. 位1的个数
 * 网址：https://leetcode-cn.com/problems/number-of-1-bits/
 * 思路：
 * 状态：
 */

class HammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String a = Integer.toHexString(n);
        System.out.println(a);
//        String a  =String.valueOf(n);
        char[] chars = a.toCharArray();
        int res=  0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1'){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
