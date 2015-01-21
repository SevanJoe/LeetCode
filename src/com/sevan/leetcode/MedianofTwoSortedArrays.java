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

import java.util.Arrays;

/**
 * Created by jiao-9 on 1/21/2015.
 */
public class MedianofTwoSortedArrays {

    /**
     * LeetCode No.2 Median of Two Sorted Arrays
     * @param A
     * @param B
     * @return
     */
    public double findMedianSortedArrays(int A[], int B[]) {
        int[] list = new int[A.length + B.length];
        System.arraycopy(A, 0, list, 0, A.length);
        System.arraycopy(B, 0, list, A.length, B.length);
        Arrays.sort(list);
        int middle = list.length / 2;
        double result;
        if (list.length % 2 == 0) {
            int left = list[middle - 1];
            int right = list[middle];
            result = (double)(left + right) / 2;
        } else {
            result = list[middle];
        }
        return result;
    }
}
