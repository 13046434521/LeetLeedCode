//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//
//
// 示例 1：
//
//
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
//
//
// 示例 2：
//
//
//输入：l1 = [0], l2 = [0]
//输出：[0]
//
//
// 示例 3：
//
//
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
//
//
//
//
// 提示：
//
//
// 每个链表中的节点数在范围 [1, 100] 内
// 0 <= com.Node.val <= 9
// 题目数据保证列表表示的数字不含前导零
//
// Related Topics 递归 链表 数学
// 👍 6676 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
package node;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = new ListNode(9);
        ListNode pre1 = listNode;
        for (int i=0;i<6;i++){
            ListNode temp = new ListNode(9);
            listNode.next = temp;
            listNode = listNode.next;
        }

        ListNode listNode2 = new ListNode(9);
        ListNode pre2 = listNode2;
        for (int i=0;i<3;i++){
            ListNode temp = new ListNode(9);
            listNode2.next = temp;
            listNode2 = listNode2.next;
        }


        ListNode pre = addTwoNumbers.addTwoNumbers(pre1,pre2);
        while (pre!=null){
            System.out.println(pre.val);
            pre= pre.next;
        }

    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode pre = l1;
//
//        addTwoNode(l1,l2,false);
//        return pre;
//    }
//
//    public void addTwoNode(ListNode l1, ListNode l2,boolean isAdd){
//        if (l1==null||l2==null){
//            return;
//        }
//
//        int res = isAdd?l1.val+ l2.val+1:l1.val+ l2.val;
//        boolean add = false;
//        if (res>=10){
//            add = true;
//            l1.val = res-10;
//        }else{
//            l1.val = res;
//        }
//        ListNode pre1 = l1;
//        ListNode pre2 = l2;
//        l1 = l1.next;
//        l2 = l2.next;
//
//        addTwoNode(l1,l2,add);
//        if (l1==null){
//            pre1.next=l2;
//            addNode(l2,add);
//        }
//        if (l2==null){
//            pre2.next=l1;
//            addNode(l1,add);
//        }
//
//    }
//
//    public void addNode(ListNode l1,boolean isAdd){
//
//        if (l1==null){
//            return;
//        }
//        boolean add = false;
//        int res = isAdd? l1.val+1:l1.val;
//        if (res>=10){
//            l1.val =  res-10;
//            add =true;
//        }
//
//        addNode(l1.next,add);
//        if (l1.next==null){
//            System.out.println(l1.val+"1111");
//            if (add){
//                ListNode listNode = new ListNode(1);
//                l1.next = listNode;
//            }
//        }
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = l1;
        boolean isAdd = false;
        while (l1!=null&&l2!=null){
            int res =isAdd?l1.val+l2.val+1: l1.val+l2.val;
            if (res>=10){
                isAdd = true;
                res = res-10;
            }else{
                isAdd = false;
            }

            l1.val  = res;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1!=null){
            int res = isAdd?l1.val + 1:l1.val ;
            if (res>=10){
                isAdd = true;
                res = res-10;
            }else{
                isAdd = false;
            }

            l1.val  = res;
            if (l1.next==null){
                if (isAdd){
                    ListNode listNode = new ListNode(1);
                    l1.next =listNode;
                    break;
                }else{
                    l1 = l1.next;
                }
            }else{
                l1 = l1.next;
            }
        }
        if (l2!=null){
            l1.next=l2.next;
        }

        while (l2!=null){
            int res = isAdd?l2.val + 1:l2.val ;
            if (res>=10){
                isAdd = true;
                res = res-10;
            }else{
                isAdd = false;
            }

            l2.val  = res;
            if (l2.next==null){
                if (isAdd){
                    ListNode listNode = new ListNode(1);
                    l2.next =listNode;
                    break;
                }else{
                    l2 = l2.next;
                }
            }else{
                l2 = l2.next;
            }
        }

        return pre;
    }
}

