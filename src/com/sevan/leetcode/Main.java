/*
 * Copyright (c) 2015. Sevan Joe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sevan.leetcode;

public class Main {

    public static void main(String[] args) {
//        testTwoSum();
//        testAddTwoNumbers();
//        testLongestSubstringWithoutRepeatingCharacters();
//        testMedianofTwoSortedArrays();
//        testLongestPalindromicSubstring();
//        testZigZagConversion();
//        testReverseInteger();
        testStringtoInteger();
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

    // No.6
    private static void testZigZagConversion() {
        String s = "0123456789";
        System.out.println(new ZigZagConversion().convert(s, 6));
    }

    // No.7
    private static void testReverseInteger() {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }

    // No.8
    private static void testStringtoInteger() {
        System.out.println(new StringtoInteger().atoi("-21474836489"));
    }
}
