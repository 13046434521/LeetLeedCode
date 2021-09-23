package LeetCode_09_10;

import java.util.ArrayList;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/10 14:38
 * 题目：876. 链表的中间结点
 *
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 * 网址： https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 思路：快慢指针，注意while循环的判空问题，防止空指针发生
 * 做完：正确
 *
 */

class MiddleNode {
   public ListNode middleNode(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;

      while(fast!=null&&fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;
      }

      return slow;
   }
}
