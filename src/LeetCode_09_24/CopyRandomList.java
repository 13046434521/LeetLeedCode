package LeetCode_09_24;


import com.Node;

import java.util.HashMap;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/24 17:22
 * 题目：剑指 Offer 35. 复杂链表的复制
 * 网址：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 * 思路：用哈希表辅助
 * 状态：完成
 */

class CopyRandomList {
    public CopyRandomList() {

    }

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node pre = head;
        while (pre!=null){
            Node temp = new Node(pre.val);
            map.put(pre,temp);
            pre = pre.next;
        }

        pre = head;
        Node node = map.get(head);
        Node temp = node;
        while (pre!=null){
            if (pre.random!=null){
                temp.random = map.get(pre.random);
            }
            if (pre.next!=null){
                temp.next = map.get(pre.next);
            }

            pre = pre.next;
            temp = temp.next;
        }

        return node;
    }
}
