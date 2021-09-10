import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/9/3 14:36
 */

class SmallestK {

    public static void main(String[] args) {
        int [] data = new int[]{1,3,5,7,2,4,6,8};
        SmallestK smallestK = new SmallestK();
        int[] res = smallestK.smallestK(data,4);
        System.out.println(Arrays.toString(res));

    }
    public int[] smallestK(int[] arr, int k) {
        int[] res= sort(arr);
        System.out.println(Arrays.toString(res));
        int[] data = Arrays.copyOf(res, k);
        return data;
    }

    public int [] sort(int[] aar) {
        for (int i = 0; i < aar.length; i++) {
            for (int j =0; j < aar.length - 1; j++) {
                if (aar[j] > aar[j+1]) {
                    int temp = aar[j+1];
                    aar[j+1] = aar[j];
                    aar[j] = temp;
                }
            }
        }

        return aar;
    }
}
