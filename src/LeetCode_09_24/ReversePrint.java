package LeetCode_09_24;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/24 16:47
 * 题目：剑指 Offer 06. 从尾到头打印链表
 * 网址：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 思路：反转链表
 * 状态：完成
 */

class ReversePrint {
   public int[] reversePrint(ListNode head) {
      ListNode node = reverseList(head);
      ListNode temp = node;
      int index = 0;
      while (temp!=null){
         temp = temp.next;
         index++;
      }

      int[]res = new int[index];
      for (int i = 0; i < res.length; i++) {
         res[i] = node.val;
         node = node.next;
      }
      return res;
   }

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
