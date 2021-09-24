package LeetCode_09_24;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/9/24 14:55
 * 题目：剑指 Offer 09. 用两个栈实现队列
 * 网址：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 思路：可以两个栈实现。也可以一个栈实现。注意：for(Integer data:Stack) 这种用法只会遍历栈中的数据。不会将数据pop。
 * 状态：完成
 */

class CQueue {
    Stack<Integer> mStack = new Stack<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        mStack.push(value);
    }

    public int deleteHead() {
        int res = -1;
        if (!mStack.isEmpty()){
            res = mStack.get(0);
            mStack.remove(0);
        }


        return res;
    }

    public static void main(String[] args) {
        CQueue c = new CQueue();

        c.appendTail(1);
        c.appendTail(2);
        c.appendTail(3);


        c.deleteHead();

        c.mStack.size();
    }
}
