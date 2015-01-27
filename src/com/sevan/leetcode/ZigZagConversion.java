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
 * Created by jiao-9 on 1/27/2015.
 */
public class ZigZagConversion {

    /**
     * LeetCode No.6 ZigZag Conversion
     *
     * @param s
     * @param nRows
     * @return
     */
    public String convert(String s, int nRows) {
        if (nRows == 1)
            return s;
        int gap = nRows + nRows - 2;
        String result = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < nRows; ++i) {
            for (int j = i; j < s.length(); ) {
                result += chars[j];
                if (i < nRows - 1) {
                    int remain = j % gap;
                    if (remain != 0) {
                        int index = j - remain + gap - remain;
                        if (index < s.length()) {
                            result += chars[index];
                        }
                    }
                }
                j += gap;
            }
        }
        return result;
    }
}
