package com.in;

/**
 * 2022/3/31 21:30
 * @author Yin Haozhen, yhz8074@qq.com
 */
public class IntervalOfMaxSum {
    public static void main(String[] args) {
        double[] historyProfit = {1.5, -12.3, 3.2, -5.5, 23.2, 3.2, -1.4, -12.2, 34.2, 5.4, -7.8, 1.1};
        dynamic(historyProfit);
    }

    static void dynamic(double[] historyProfit) {
        int days = historyProfit.length;
        double[] accumulatedSum = new double[days];
        double maxSum = 0.0;
        int maxSumBuyDate = 0;
        int maxSumSellDate = 0;


        accumulatedSum[0] = historyProfit[0];
        for (int today = 1; today < days; today++) {
            if (accumulatedSum[today - 1] > 0) {
                accumulatedSum[today] = accumulatedSum[today - 1] + historyProfit[today];
                if (accumulatedSum[today] > maxSum) {
                    maxSum = accumulatedSum[today];
                    maxSumSellDate = today;
                }
            } else {
                accumulatedSum[today] = historyProfit[today];
                maxSumBuyDate = today;
            }

        }

        System.out.printf("max sum is %s, buy in day%s, sell in day%s", maxSum, maxSumBuyDate + 1, maxSumSellDate + 1);
    }

}
