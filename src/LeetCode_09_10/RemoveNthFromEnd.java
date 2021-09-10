package LeetCode_09_10;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/10 14:54
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast =head;
        ListNode pre = new ListNode(0,head);
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
