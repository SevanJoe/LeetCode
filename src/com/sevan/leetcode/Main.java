package com.sevan.leetcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        testTwoSum();
    }

    private static void testTwoSum() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int [] result = new TwoSum().twoSum(numbers, target);
        System.out.println("index1=" + result[0] + ", " + "index2=" + result[1]);
    }
}
