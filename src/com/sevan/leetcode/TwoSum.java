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

import java.util.HashMap;

/**
 * Created by jiao-9 on 1/21/2015.
 */
public class TwoSum {

    /**
     * LeetCode No.1 Two Sum
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; ++i) {
            hashMap.put(numbers[i], i + 1);
        }
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; ++i) {
            int missingValue = target - numbers[i];
            if (hashMap.get(missingValue) != null && hashMap.get(missingValue) != i + 1) {
                result[0] = i + 1;
                result[1] = hashMap.get(missingValue);
                return result;
            }
            hashMap.remove(numbers[i]);
        }
        return result;
    }
}
