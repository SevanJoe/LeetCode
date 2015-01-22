package com.sevan.leetcode;

public class Main {

    public static void main(String[] args) {
//        testTwoSum();
//        testAddTwoNumbers();
//        testLongestSubstringWithoutRepeatingCharacters();
//        testMedianofTwoSortedArrays();
        testLongestPalindromicSubstring();
    }

    // No.1
    private static void testTwoSum() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int [] result = new TwoSum().twoSum(numbers, target);
        System.out.println("index1=" + result[0] + ", " + "index2=" + result[1]);
    }

    // No.2
    private static void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" - >");
            }
            result = result.next;
        }
    }

    // No.3
    private static void testLongestSubstringWithoutRepeatingCharacters() {
        String s = "ABCABCABCD";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    // No.4
    private static void testMedianofTwoSortedArrays() {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};
        System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(A, B));
    }

    // No.5
    private static void testLongestPalindromicSubstring() {
        String s = "eabcbd";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(s));
    }
}
