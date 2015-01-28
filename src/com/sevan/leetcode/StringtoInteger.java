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
 * Created by jiao-9 on 1/28/2015.
 */
public class StringtoInteger {

    /**
     * LeetCode No.8 String to Integer (atoi)
     *
     * @param str input
     * @return result
     */
    public int atoi(String str) {
        int startIndex = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] != ' ') {
                startIndex = i;
                break;
            }
            if (i == chars.length - 1) {
                return 0;
            }
        }
        int[] numbers = new int[str.length()];
        int index = 0;
        int sign = 1;
        for (int i = startIndex; i < chars.length; ++i) {
            if (i == startIndex && (chars[i] == '+' || chars[i] == '-')) {
                if (chars[i] == '-') {
                    sign = -1;
                }
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                numbers[index] = chars[i] - 48;
                ++index;
            } else {
                break;
            }
        }
        int result = 0;
        for (int i = 0; i < index; ++i) {
            try {
                result += sign * Math.pow(10, index - i - 1) * numbers[i];
            } catch (Exception e) {
                if (sign == 1) {
                    result = Integer.MAX_VALUE;
                }
                if (sign == -1) {
                    result = Integer.MIN_VALUE;
                }
                return result;
            }
        }
        return result;
    }
}
