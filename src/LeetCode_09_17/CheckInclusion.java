package LeetCode_09_17;


/**
 * @author jtl
 * @date 2021/9/17 10:37
 * 题目：567. 字符串的排列
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。
 * 换句话说，s1 的排列之一是 s2 的 子串
 * <p>
 * 网址：https://leetcode-cn.com/problems/permutation-in-string/
 * 思路：
 * 做完：
 */

class CheckInclusion {
    public static boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
        int start = 0;
        int end = length;

        while (end <= s2.length()) {
            String temp = s2.substring(start,end);
            System.out.println(temp);
            if (s1.equals(temp)){
                System.out.println("正"+temp);
                return true;
            }else if (s1.equals(reversString(temp))){
                System.out.println("反"+temp);
                return true;
            }

            end++;
            start++;
        }

        return false;
    }

    public static String reversString(String s1) {
        int left = 0;
        int right = s1.length() - 1;
        char[] res = s1.toCharArray();
        while (left < right) {
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

        return new String(res);
    }

    public static boolean isInclude(String s1,String s2){
        char[] data1 = s1.toCharArray();
        char[] data2 = s2.toCharArray();
        char[] temp = new char[data1.length];

        for (int i=0;i<data1.length;i++){
            temp[i] = data1[i];
        }


        return true;
    }

    public static void main(String[] args) {
        String aa = "5767";
        String bb="5767";
        System.out.println(isInclude(bb,aa));
    }
}
