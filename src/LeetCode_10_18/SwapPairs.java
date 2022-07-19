package LeetCode_10_18;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/10/18 14:43
 * 题目：24. 两两交换链表中的节点
 * 网址：https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * 思路：三指针。
 * 状态：完成
 */

class SwapPairs {
    public ListNode swapPairs(ListNode head){
        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode temp = pre;

        while (temp.next!=null&&temp.next.next!=null){
            ListNode temp1 = temp.next;
            ListNode temp2 = temp.next.next;

            temp.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;

            temp = temp1;
        }

        return pre.next;
    }
}
