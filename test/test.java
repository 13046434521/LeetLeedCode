import org.junit.jupiter.api.Test;

/**
 * @author jtl
 * @date 2021/8/12 16:21
 */

class test {
   @Test
   public static void main(String[] args) {

      new Thread(()->{
         int i = 1;
         while (i<10000){
            if (i%3==0){
               System.out.println(("i:" + i));
               continue;
            }

            i++;
         }
      }).start();
   }

   public static void test1(){
      long tt = System.currentTimeMillis();
      int N =1000000;
      for (int i=0;i<N;i++){
         int a = 4+6;
         int b = a*7;
         int c = a*8;
      }

      System.out.println((System.currentTimeMillis()-tt)+"");
   }

   public static void test2(){
      long tt = System.currentTimeMillis();
      int N =1000000;
      for (int i=0;i<N;i++){
         int a = 4^6;
         int b = a&7;
         int c = a&8;
      }
      System.out.println((System.currentTimeMillis()-tt)+"");
   }

}
