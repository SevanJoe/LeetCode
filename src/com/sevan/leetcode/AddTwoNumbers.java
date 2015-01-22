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
public class AddTwoNumbers {

    /**
     * LeetCode No.2 Add Two Numbers
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        return nextNode(result, l1, l2);
    }

    private ListNode nextNode(ListNode current, ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            if (current.val == 0)
                current = null;
            return current;
        }
        current.val += (getValue(l1) + getValue(l2));
        if (current.val >= 10) {
            current.val -= 10;
            current.next = new ListNode(1);
        } else {
            current.next = new ListNode(0);
        }
        current.next = nextNode(current.next, getNextNode(l1), getNextNode(l2));
        return current;
    }

    private int getValue(ListNode listNode) {
        if (listNode == null)
            return 0;
        else
            return listNode.val;
    }

    private ListNode getNextNode(ListNode listNode) {
        if (listNode == null)
            return null;
        else
            return listNode.next;
    }
}
