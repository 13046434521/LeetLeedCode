package LeetCode_09_15;

/**
 * @author jtl
 * @date 2021/9/16 15:39
 * 题目： 剑指 Offer 03. 数组中重复的数字
 * 网址： https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 思路：利用数组查重
 * 做完：正确
 */

class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int[] data = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (data[nums[i]] != 0) {
                return nums[i];
            } else {
                data[nums[i]] = 1;
            }
        }

        return 0;
    }
}
