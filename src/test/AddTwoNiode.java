package test;

import java.util.HashSet;

import node.ListNode;

/**
 * @author jtl
 * @date 2022/4/29 10:30
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class AddTwoNiode {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null||pHead.next==null){
            return null;
        }

        ListNode slow = pHead;
        ListNode fast = pHead.next;
        int count =0;
        int count1 = 0;
        boolean isCircle = false;


        while (fast!=null&&fast.next!=null){
            count++;
            count1+=2;
            // 如果相等，说明成环
            if (fast == slow){
                isCircle = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(isCircle);
        // 不成环，返回null
        if (!isCircle){
            return null;
        }

        ListNode listNode = pHead;
        HashSet<ListNode> hashSet = new HashSet();
        for (int i = 0;i<count;i++){
            if (!hashSet.contains(listNode)){
                hashSet.add(listNode);
            }else{
                return listNode;
            }
            listNode = listNode.next;
        }


        return null;
    }
}
