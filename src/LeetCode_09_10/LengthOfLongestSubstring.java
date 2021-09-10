package LeetCode_09_10;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author jtl
 * @date 2021/9/10 15:42
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String data = "abb ";
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            hashMap.put(data,"");
        }
        hashMap.put(data,"");
        hashMap.put(data,"");
        hashMap.put(data,"");
        hashMap.put(data,"");
        hashMap.put(data,"");
        hashMap.put(data,"");
        System.out.println(hashMap.size());

//        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
//        System.out.println(substring.lengthOfLongestSubstring(data));
    }

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        char[] source = s.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            char c = source[i];
            if (characters.containsKey(c)) {
                int temp = characters.size();
                res = Math.max(temp, res);
            }
            characters.put(c, i);

        }


        return Math.max(characters.size(), res);
    }
}
