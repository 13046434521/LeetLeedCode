package LeetCode_09_23;

import node.ListNode;

/**
 * @author jtl
 * @date 2021/9/22 10:36
 * 题目：
 * 网址：
 * 思路：
 * 做完：
 */

class aaa {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            res += (n >> i & 1) << (31 - i);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 1534236469;
        String a = "123456789";
//        System.out.println(a.substring(0, 9));
        System.out.println(reverse(n));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0, head);
        ListNode slow = pre;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        System.out.println(fast.val + " 1 " + slow.val);
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(fast.val + " 2 " + slow.val);
        slow.next = slow.next.next;

        return head;
    }

    public int findRepeatNumber(int[] nums) {
        int[] data = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (data[nums[i]] == 0) {
                data[nums[i]] = 1;
            } else {
                return nums[i];
            }
        }


        return 0;
    }

    public static int reverse(int x) {
        long res = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp = temp / 10;

        }
        res = x>0?res:-res;
        if (res>Math.pow(2,31)-1||res<Math.pow(2,-31)){
            res = 0;
        }
        System.out.println(res);
        return  (int)res;
    }
}
