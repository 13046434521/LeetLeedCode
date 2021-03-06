package LeetCode_09_10;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/10 14:54
 * 题目：19. 删除链表的倒数第 N 个结点
 *
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 * 网址：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 思路：快慢指针。
 * 做完：做完
 */

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0,head);
        ListNode fast =head;
        ListNode slow =pre;//避免[1],1 的问题，且能避免很多空指针问题

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return pre.next;
    }
}
