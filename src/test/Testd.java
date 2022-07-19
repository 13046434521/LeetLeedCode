package test;

/**
 * @author jtl
 * @date 2021/11/12 15:16
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

public class Testd {
    static {
        System.out.println("我Testd加载了");
    }
    public static String gg = "什么鬼";
    public final int e = 100;
    public static final String f = "什么鬼";
    public String g = "有毛病";
    public static void main(String[] args) throws InterruptedException {
        Testb[] arrayB =  new Testb[]{};
        int[] inta = new int[]{};
        int d =Testc.addInteger(Testa.a,Testb.b);
        System.out.println(d);

        Testd testd = new Testd();
        testd.ccc();
        Thread.sleep(1000000);
    }
    public void ccc(){
        D DDD =  new D();
        System.out.println(DDD.dd);
    }

    class D{
        private  int dd = 10;
        D(){
            System.out.println("我DDD执行初始化了");
        }
    }
}
