package LeetCode_10_21;

import java.util.PriorityQueue;

/**
 * @author jtl
 * @date 2021/10/21 17:51
 * 题目：703. 数据流中的第 K 大元素
 * 网址：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 * 思路：优先队列。只保存k个元素。优先队列 默认排序为升序。
 * 状态：完成
 */

class KthLargest {
   int num;
   PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
       priorityQueue = new PriorityQueue<Integer>(k);
       num = k;

       for (int i = 0; i < nums.length; i++) {
           this.add(nums[i]);
        }
    }

    public int add(int val) {
       if (priorityQueue.size()<num){
          priorityQueue.offer(val);
       } else {
          int temp = priorityQueue.peek();
          if (val>temp){
             priorityQueue.poll();
             priorityQueue.offer(val);
          }
       }

       return priorityQueue.peek();
    }


    public static void main(String[] args) {
        int[] test = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, test);
       System.out.println(kthLargest.add(3));
       System.out.println(kthLargest.add(5));
       System.out.println(kthLargest.add(10));
       System.out.println(kthLargest.add(9));
       System.out.println(kthLargest.add(4));
    }
}
