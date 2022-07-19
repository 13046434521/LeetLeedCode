package test;

import java.io.Serializable;

/**
 * @author jtl
 * @date 2021/11/18 10:28
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class Testf {
    static {
        System.out.println("Testf加载了");
    }

    private void test(int a){
        System.out.println("int:"+a);
    }

    private void test(long a){
        System.out.println("long:"+a);
    }

    private void test(float a){
        System.out.println("float:"+a);
    }

    private void test(double a){
        System.out.println("double:"+a);
    }

    private void test(char a){
        System.out.println("char:"+a);
    }

    private void test(Character a){
        System.out.println("Character:"+a);
    }

    private void test(String a){
        System.out.println("String:"+a);
    }

    private void test(Serializable a){
        System.out.println("Serializable:"+a);
    }

    public static void main(String[] args) {
        Testf testf = new Testf();
        testf.test('a');
    }
}
