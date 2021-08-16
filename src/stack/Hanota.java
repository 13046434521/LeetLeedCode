package stack;

import java.util.List;
import java.util.Stack;

/**
 * @author jtl
 * @date 2021/8/12 13:52
 * 汉诺塔问题
 */

class Hanota {
    public static void main(String[] args) {

    }


    private Stack<Integer> leftStack = new Stack<>();
    private Stack<Integer> midStack = new Stack<>();
    private Stack<Integer> rightStack = new Stack<>();
    public void hannota(Stack<Integer> stack){

    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        while (!A.isEmpty()){
            int size = A.size();
            int data = A.get(size-1);

            move(A,B,C);

        }
    }

    public void move(List<Integer> a, List<Integer> b, List<Integer> c){

    }
}
