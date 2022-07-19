package LeetCode_11_02;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/11/2 10:54
 * 题目：237. 删除链表中的节点
 * 网址：https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 思路：
 * 状态：完成
 */

class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode pre = node.next;
        int res = pre.val;
        node.val = pre.val;
        node.next = pre.next;
        pre.next = null;
    }
}
