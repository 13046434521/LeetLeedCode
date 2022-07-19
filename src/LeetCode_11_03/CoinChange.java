package LeetCode_11_03;

/**
 * @author jtl
 * @date 2021/11/3 15:26
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        dp[amount] = Integer.MAX_VALUE;

        for(int i = 1;i<=amount;i++){
            for(int j = 0;j<coins.length;j++){
                if(i-coins[j]>=0&&dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[j],dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount];
    }
}
