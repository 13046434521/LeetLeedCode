package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 17:13
 * https://leetcode-cn.com/problems/permutation-in-string/
 */

class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int length = s1.length();

        for (int i=0;i<s2.length()-length;i++){
            String temp = s2.substring(i,i+length);
            if (temp.equals(s1)){
                return true;
            }
        }

        return false;
    }
}
