package LeetCode_09_15;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/15 15:30
 * 题目：剑指 Offer II 021. 删除链表的倒数第 n 个结点
 *
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 网址：https://leetcode-cn.com/problems/SLwz0R/
 * 思路：快慢指针。
 * 做完：做完
 */

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0,head);
        ListNode fast = head;
        ListNode slow = pre;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        // 用pre.next 而不用head的原因是  [1] 1 这种特殊情况
        return pre.next;
    }
}
