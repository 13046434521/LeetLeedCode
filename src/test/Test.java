package test;

import java.sql.SQLOutput;

/**
 * @author jtl
 * @date 2021/11/18 17:33
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class Test<E extends test.Father> {
   private E aa ;
   public static void main(String[] args) {
      Father father = new Son<Integer>();
      Test<test.Son> test = new Test<>();
   }

   static class Father{
      public Father(){
         System.out.println("Father:"+this.toString());
         eat();
      }
      public void eat(){
         System.out.println("Father:eat:"+this.toString());
      }
   }

   static class Son<E> extends Father {
      public Son(){
         eat();
      }


      @Override
      public void eat(){
         System.out.println("Son:eat:"+this.toString());
      }
   }
}
