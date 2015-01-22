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
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            int lastIndex = s.lastIndexOf(s.charAt(i));
            if (lastIndex == -1) {
                continue;
            }
            String origin = s.substring(i, lastIndex + 1);
            StringBuilder stringBuilder = new StringBuilder(origin);
            stringBuilder.reverse();
            String reverse = stringBuilder.toString();
            if (origin.equals(reverse)) {
                if (origin.length() > result.length()) {
                    result = origin;
                }
                if (s.substring(lastIndex).length() < result.length()) {
                    break;
                }
            }
        }

        return result;
    }
}
