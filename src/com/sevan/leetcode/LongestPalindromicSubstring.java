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
 * Created by jiao-9 on 1/22/2015.
 */
public class LongestPalindromicSubstring {

    /**
     * LeetCode No.5 Longest Palindromic Substring
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            String longest1 = getLongestByCenter(s, i, i);
            if (longest1.length() > result.length()) {
                result = longest1;
            }
            String longest2 = getLongestByCenter(s, i, i + 1);
            if (longest2.length() > result.length()) {
                result = longest2;
            }
        }
        return result;

//        for (int i = 0; i < s.length(); ++i) {
//            if (s.substring(i).length() <= result.length())
//                break;
//
//            int lastIndex = s.length();
//            while (s.substring(i + 1, lastIndex).lastIndexOf(s.charAt(i)) != -1) {
//                lastIndex = s.substring(i + 1, lastIndex).lastIndexOf(s.charAt(i)) + i + 1;
//                String origin = s.substring(i, lastIndex + 1);
//                StringBuilder stringBuilder = new StringBuilder(origin);
//                stringBuilder.reverse();
//                String reverse = stringBuilder.toString();
//                if (origin.equals(reverse)) {
//                    if (origin.length() > result.length()) {
//                        result = origin;
//                        break;
//                    }
//                }
//            }
//        }
//
//        return result;
    }

    private String getLongestByCenter(String s, int left, int right) {
        char[] chars = s.toCharArray();
        while (left >= 0 && right < s.length() && chars[left] == chars[right]) {
            --left;
            ++right;
        }
        return s.substring(left + 1, right);
    }
}
