package LeetCode_10_18;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/10/18 14:31
 * 题目：141. 环形链表
 * 网址：https://leetcode-cn.com/problems/linked-list-cycle/
 * 思路：快慢指针，相遇有环
 * 状态：
 */

class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast){
                return true;
            }
        }

        return false;
    }
}
