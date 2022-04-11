package com.in;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022/3/31 22:06
 *
 * @author Yin Haozhen, yhz8074@qq.com
 */
public class IntervalOfGivenSum {
    public static void main(String[] args) {
//        double[] input = {1.5, -12.3, 3.2, -5.5, 23.2, 3.2, -1.4, -12.2, 34.2, 5.4, -7.8, 1.1};
//        int[] input = {15, -123, 32, -55, 232, 32, -14, -122, 342, 54, -78, 11};
        int[] input = {5, 2, 7,0,0,8,7,1,1,2,5,6};
        solution1(input, 9);
        solution2(input, 9);
    }

    private static void solution2(int[] input, int givenSum) {
        int length = input.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            sum += input[i];
            if (sum == givenSum) {
                System.out.printf("input[%s] = %s\n", i, givenSum);
            }
            map.put(sum, i);
            if (map.containsKey(sum - givenSum)) {
                System.out.printf("[%s, %s] = %s\n", map.get(sum - givenSum) + 1, i, givenSum);
            }
        }
    }

    private static void solution(int[] input, int givenSum) {
        int length = input.length;
        int l = 0;
        int r = 1;
        int curSum = input[0];
        while (l < r) {
            if (curSum < 0) {

            }
        }

    }

    private static void solution1(int[] input, int givenSum) {
        int length = input.length;
        int[][] sums = new int[length][length];
        for (int l = 0; l < length; l++) {
            sums[l][l] = input[l];
            for (int r = l + 1; r < length; r++) {
                sums[l][r] = sums[l][r - 1] + input[r];
                if (sums[l][r] == givenSum) {
                    System.out.printf("left boundary is %s, right boundary is %s\n", l, r);
                }
            }

        }
    }
}