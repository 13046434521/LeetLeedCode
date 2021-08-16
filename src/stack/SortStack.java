package stack;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/8/11 17:54
 */

class SortStack {
    public static void main(String[] args) {
        Stack<Integer> sortStack1 = new Stack();
        for (int i = 0; i < 10; i++) {
            sortStack1.push(i);
        }

        for (Integer integer : sortStack1) {
            System.out.println(integer);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        SortStack sortStack = new SortStack();
        for (int i = 0; i < 10; i++) {
            sortStack.push(i);
        }

        for (Integer integer : sortStack.mStack) {
            System.out.println(integer);
        }
        System.out.println("---------------");

        sortStack.push(3);

        while (!sortStack.isEmpty()) {
            System.out.println(sortStack.peek());
            sortStack.pop();
        }


    }

    private Stack<Integer> mStack = new Stack();

    public void SortedStack() {

    }

    public void push(int val) {
        reversStack(mStack, val);
    }

    public void pop() {
        mStack.pop();
    }

    public int peek() {
        if (mStack.isEmpty()) {
            return -1;
        }
        return mStack.peek();
    }

    public boolean isEmpty() {
        return mStack.isEmpty();
    }

    public void reversStack(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int result = stack.peek();
        if (val >= result) {
            stack.push(val);
        } else {
            int num = stack.pop();
            reversStack(stack, val);
            stack.push(num);
        }
    }
}
