package LeetCode_09_24;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author jtl
 * @date 2021/9/24 18:32
 * 题目：剑指 Offer 05. 替换空格
 * 网址：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * 思路：最差情况为全是空格。所以最差情况下，返回结果的数组长度为 new char[length*3];
 * 状态：完成
 */

class ReplaceSpace {
    public String replaceSpace(String s) {
        int length= s.length();
        int index = 0;
        char[] data = s.toCharArray();
        char [] res = new char[length*3];
        for (int i=0;i<data.length;i++){
            char temp = data[i];

            if (temp==' '){
                res[index++] = '%';
                res[index++] = '2';
                res[index++] = '0';
            }else{
                res[index++] = temp;
            }
        }

        return new String(res,0,index);
    }
}
