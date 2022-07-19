package test;

/**
 * @author jtl
 * @date 2021/11/18 17:02
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class Program {
    public static void main( String[ ] args ) {
        Program b = new B( );
        b.foo( 0 ); // B.foo( int )
    }
    public void foo( int i ) {
        System.out.println( "A.foo( int )" );
    }

    static class B extends Program {

        @Override
        public void foo(int i ) {
            System.out.println( "B.foo( int )" );
        }
    }


}
