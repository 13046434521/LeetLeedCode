package LeetCode_10_22;

import java.util.Stack;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/10/22 10:25
 * 题目：面试题 02.06. 回文链表
 *      编写一个函数，检查输入的链表是否是回文的。
 * 网址：https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 * 思路：用栈先入后出的特殊性来和链表中的数进行比对。
 * 状态：完成
 */

class IsPalindrome {
    public static boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node!=null){
            stack.push(node);
            node = node.next;
        }
        node = head;
        while (!stack.isEmpty()){
            if (node.val!=stack.pop().val){
                return false;
            }
            node = node.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(0);

        System.out.println(isPalindrome(listNode));
    }
}
