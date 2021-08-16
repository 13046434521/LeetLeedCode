package stack;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/8/11 17:16
 * 仅用递归函数和栈操作逆序一个栈
 * 依次往栈里输入：9,8,7,6,5,4,3,2,1,0，
 * 要求从栈中输出：0,1,2,3,4,5,6,7,8,9，
 */

class ReverseOrder {
   public static void main(String[] args) {
      ReverseOrder reverseOrder = new ReverseOrder();
      Stack<Integer> stack = new Stack<>();
      for (int i=0;i<10;i++){
         stack.push(i);
      }
      for (Integer integer : stack) {
         System.out.println(integer);
      }
      reverseOrder.reverse(stack);

      for (int i=0;i<stack.size();i++){
         System.out.println(stack.get(i));
      }
   }

   public int reverseOrder(Stack<Integer> stack){
      int i = stack.pop();
      if (stack.isEmpty()){
         return i;
      }else{
         int data = reverseOrder(stack);
         stack.push(i);
         return data;
      }
   }

   public void reverse(Stack<Integer> stack){
      if (stack.isEmpty()){
         return ;
      }
      int data  = reverseOrder(stack);
      reverse(stack);
      stack.push(data);
   }
}
