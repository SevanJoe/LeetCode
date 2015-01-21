package com.sevan.leetcode;

public class Main {

    public static void main(String[] args) {
//        testTwoSum();
        testMedianofTwoSortedArrays();
    }

    private static void testTwoSum() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int [] result = new TwoSum().twoSum(numbers, target);
        System.out.println("index1=" + result[0] + ", " + "index2=" + result[1]);
    }

    private static void testMedianofTwoSortedArrays() {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};
        System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(A, B));
    }
}
