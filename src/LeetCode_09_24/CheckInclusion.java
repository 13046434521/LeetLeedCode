package LeetCode_09_24;


/**
 * @author jtl
 * @date 2021/9/17 10:37
 * 题目：567. 字符串的排列
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。
 * 换句话说，s1 的排列之一是 s2 的 子串
 * <p>
 * 网址：https://leetcode-cn.com/problems/permutation-in-string/
 * 思路：滑动窗口。通过数组进行比较。
 * 做完：完成
 */

class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
        int p1 = 0;
        int p2 = length-1;

        while (p2<s2.length()){
            String temp = s2.substring(p1,p2+1);
            if (isInclude(s1,temp)){
                return true;
            }

            p1++;
            p2++;
        }


        return false;
    }

    public boolean isInclude(String s1,String s2){
        int[] test1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i);
            test1[index-'a'] = test1[index] + 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i);
            test1[index-'a']-=1;

            if (test1[index-'a']<0){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        String aa = "56";
        String bb="5767";
        CheckInclusion checkInclusion = new CheckInclusion();
        System.out.println(checkInclusion.checkInclusion(aa,bb));
        System.out.println(0+'z');
    }
}
