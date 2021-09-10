package LeetCode_09_10;

import java.util.ArrayList;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/10 14:38
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */

class MiddleNode {
   public ListNode middleNode(ListNode head) {
      ArrayList<ListNode> arrayList = new ArrayList<>();
      ListNode cur = head;
      while (cur!=null){
         arrayList.add(cur);
         cur = cur.next;
      }

      int middle = arrayList.size()/2+1;
      ListNode middleNode = arrayList.get(middle);

      return middleNode;
   }
}
