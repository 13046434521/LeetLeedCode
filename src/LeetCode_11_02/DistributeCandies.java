package LeetCode_11_02;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author jtl
 * @date 2021/11/1 18:57
 * 题目：575. 分糖果
 * 网址：https://leetcode-cn.com/problems/distribute-candies/
 * 思路：通过HashSet过滤相同值
 * 状态：完成
 */

class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hashSet = new HashSet<>(0);
        for (int i = 0; i < candyType.length; i++) {
            if (!hashSet.contains(candyType[i])){
                hashSet.add(candyType[i]);
            }
        }

        int type = hashSet.size();
        int result = 0;
        if (type>=candyType.length/2){
            result = candyType.length/2;
        }else{
            result = type;
        }
        return result;
    }
}
