package LeetCode_09_24;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/9/24 15:13
 * 题目：剑指 Offer 30. 包含min函数的栈
 * 网址：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 * 思路：
 * 状态：
 */

class MinStack {
    /**
     * initialize your data structure here.
     */
    Stack<Integer> mStack = new Stack<>();
    Stack<Integer> mStackMin = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
       if (mStackMin.isEmpty()||mStackMin.lastElement()>=x){
          mStackMin.push(x);
       }
       mStack.push(x);
    }

    public void pop() {
       int res = mStack.pop();
       if (res == mStackMin.lastElement()){
          mStackMin.pop();
       }
    }

    public int top() {
        return mStack.lastElement();
    }

    public int min() {
        return mStackMin.lastElement();
    }

   public static void main(String[] args) {
       MinStack minStack = new MinStack();
       minStack.push(85);
      minStack.push(-99);
      minStack.push(67);
      System.out.println(minStack.min());
   }
}
