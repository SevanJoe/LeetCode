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

/**
 * Created by Sevan Joe on 1/29/2015.
 */
public class PalindromeNumber {

    /**
     * LeetCode No.9 Palindrome Number
     *
     * @param x input value
     * @return result
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digits = 1;
        int temp = x;
        while (temp >= 10) {
            temp /= 10;
            ++digits;
        }
        int left;
        int right;
        int remainCount = digits / 2;
        while (remainCount > 0) {
            left = (x / (int) Math.pow(10, digits - remainCount)) % 10;
            right = (x / (int) Math.pow(10, remainCount - 1)) % 10;
            if (left == right) {
                --remainCount;
            } else {
                return false;
            }
        }
        return true;
    }
}
