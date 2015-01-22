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

import java.util.HashSet;

/**
 * Created by jiao-9 on 1/22/2015.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * LeetCode No.3 Longest Substring Without Repeating Characters
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<Character>();
        int leftIndex = 0;
        int rightIndex = 0;
        int size = 0;
        while (rightIndex < s.length()) {
            if (hashSet.contains(s.charAt(rightIndex))) {
                if (size < rightIndex - leftIndex) {
                    size = rightIndex - leftIndex;
                }
                while (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                    hashSet.remove(s.charAt(leftIndex));
                    ++leftIndex;
                }
                ++leftIndex;
            } else {
                hashSet.add(s.charAt(rightIndex));
            }
            ++rightIndex;
        }
        size = Math.max(size, rightIndex - leftIndex);
        return size;

//        String result = "";
//        int startIndex = 0;
//        for (int i = 1 ; i <= s.length(); ++i) {
//            String substring = s.substring(startIndex, i);
//            if (substring.length() > result.length()) {
//                result = substring;
//            }
//            String next = "";
//            if (i < s.length()) {
//                next = String.valueOf(s.charAt(i));
//            }
//            if (!next.isEmpty() && substring.contains(next)) {
//                startIndex = s.substring(0, i).lastIndexOf(next) + 1;
//                i = startIndex + result.length() - 1;
//            }
//            if (s.substring(startIndex, s.length()).length() <= result.length()) {
//                break;
//            }
//        }
//        return result.length();

//        for (int i = 0; i < s.length(); ++i) {
//            for (int j = i + 1; j <= s.length(); ++j) {
//                String subString = s.substring(i, j);
//                char[] list = subString.toCharArray();
//                HashSet<Character> set = new HashSet<Character>();
//                for (char aList : list) {
//                    set.add(aList);
//                }
//                if (set.size() == list.length) {
//                    if (set.size() > result.length()) {
//                        result = subString;
//                        if (s.substring(j, s.length()).length() <= subString.length()) {
//                            return result.length();
//                        }
//                    }
//                } else {
//                    i = j - 2;
//                    j = s.length() + 1;
//                }
//            }
//        }
//        return result.length();
    }
}
