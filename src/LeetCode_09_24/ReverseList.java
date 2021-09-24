package LeetCode_09_24;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/24 17:11
 * 题目：206. 反转链表
 * 网址：https://leetcode-cn.com/problems/reverse-linked-list/
 * 思路：快慢指针。慢指针从Null开始
 * 状态：完成
 */

class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode fast = head;
        ListNode slow = null;

        while (fast!=null){
            ListNode temp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = temp;
        }

        return slow;
    }
}
