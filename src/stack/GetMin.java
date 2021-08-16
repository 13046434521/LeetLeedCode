package stack;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/8/11 15:06
 * //设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * //
 * //
 * // push(x) —— 将元素 x 推入栈中。
 * // pop() —— 删除栈顶的元素。
 * // top() —— 获取栈顶元素。
 * // getMin() —— 检索栈中的最小元素。
 * //
 * //
 * //
 * //
 * // 示例:
 * //
 * // 输入：
 * //["MinStack","push","push","push","getMin","pop","top","getMin"]
 * //[[],[-2],[0],[-3],[],[],[],[]]
 * //
 * //输出：
 * //[null,null,null,null,-3,null,0,-2]
 * //
 * //解释：
 * //MinStack minStack = new MinStack();
 * //minStack.push(-2);
 * //minStack.push(0);
 * //minStack.push(-3);
 * //minStack.getMin();   --> 返回 -3.
 * //minStack.pop();
 * //minStack.top();      --> 返回 0.
 * //minStack.getMin();   --> 返回 -2.
 */

class GetMin {
    public static void main(String[] args) {
    }


    class MinStack {
        /**
         * 解答成功:
         * 执行耗时:352 ms,击败了5.00% 的Java用户
         * 内存消耗:40.2 MB,击败了47.03% 的Java用户
         */

        private Stack<Integer> mStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            mStack = new Stack<>();
        }

        public void push(int val) {
            mStack.push(val);
        }

        public void pop() {
            mStack.pop();
        }

        public int top() {
            return mStack.lastElement();
        }

        public int getMin() {
            int minCount = 0;
            for (int i = 0; i < mStack.size(); i++) {
                int temp = mStack.get(i);
                int min = mStack.get(minCount);
                if (min >= temp) {
                    minCount = i;
                }
            }
            return mStack.get(minCount);
        }
    }

    /**
     * 			解答成功:
     * 			执行耗时:5 ms,击败了87.21% 的Java用户
     * 			内存消耗:40 MB,击败了78.44% 的Java用户
     */

    class MinStack2 {
        private Stack<Integer> mStackNum;
        private Stack<Integer> mStackMin;

        /**
         * initialize your data structure here.
         */
        public MinStack2() {
            mStackNum = new Stack<>();
            mStackMin = new Stack<>();
        }

        public void push(int val) {
            mStackNum.push(val);
            if (mStackMin.isEmpty()||val<mStackMin.lastElement()) {
                mStackMin.push(val);
            }
        }

        public void pop() {
            int popNum = mStackNum.pop();
            if (mStackMin.firstElement() == popNum) {
                mStackMin.pop();
            }
        }

        public int top() {
            return mStackNum.lastElement();
        }

        public int getMin() {
            return mStackMin.firstElement();
        }
    }

    class MinStack3 {
        private Stack<Integer> mStackNum;
        private Stack<Integer> mStackMin;

        /**
         * initialize your data structure here.
         */
        public MinStack3() {
            mStackNum = new Stack<>();
            mStackMin = new Stack<>();
        }

        public void push(int val) {
            mStackNum.push(val);
            int num = 0;
            if (mStackMin.isEmpty()||val<mStackMin.lastElement()) {
                num = val;
            }else{
                num = mStackNum.lastElement();
            }

            mStackMin.push(num);
        }

        public void pop() {
            mStackNum.pop();
            mStackMin.pop();
        }

        public int top() {
            return mStackNum.lastElement();
        }

        public int getMin() {
            return mStackMin.firstElement();
        }
    }
}
