package LeetCode_09_15;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/16 16:07
 * 题目： 剑指 Offer 22. 链表中倒数第k个节点
 * 网址： https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * 思路：快慢指针、由于只是查找倒数第k个节点而不是删除。所以不需要知道他的前节点。所以slow直接为head就可以。
 *       该题和删除倒数第k个节点类似。属于简化版。
 * 做完：正确
 */

class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
