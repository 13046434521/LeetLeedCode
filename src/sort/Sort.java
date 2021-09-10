package sort;

/**
 * @author jtl
 * @date 2021/8/12 16:50
 */

public abstract class Sort {
    protected static int[] data = new int[]{4,2,1,3,1,-1,9,2,-10,-20,-11,9,20,100,-190};
//protected static int[] data = new int[]{1,2,3,4,5,6,7};
    public abstract int[] sort(int[] arr);
}
