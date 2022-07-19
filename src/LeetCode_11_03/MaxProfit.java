package LeetCode_11_03;

/**
 * @author jtl
 * @date 2021/11/3 11:36
 * 题目：121. 买卖股票的最佳时机
 * 网址：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 思路：
 * 状态：
 *
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */

class MaxProfit {
    public int maxProfit(int[] prices) {
        int price = 0;

        for (int i=0;i<prices.length;i++){
            for (int j=prices.length-1;j>i;j--){
                int temp = prices[j]-prices[i];
                price = Math.max(temp,price);
            }
        }

        return price;
    }

    // 假设第n天卖掉的最大利润为dp[n]
    public int dp(int n,int[] price){
        if (price.length==1){
            return 1;
        }

return 0;
    }

}
