package sort;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/8/12 16:50
 * 冒泡排序
 */

class BubbleSort extends Sort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(data);
        System.out.println(Arrays.toString(data));
    }

    @Override
    public int[] sort(int[] aar) {
        for (int e = aar.length - 1; e > 0; e--) {
            boolean isSort = false;
            for (int i = 0; i < e; i++) {
                if (aar[i] > aar[i + 1]) {
                    swap(aar, i, i + 1);
                    isSort = true;
                }
            }
            if (!isSort) {
                System.out.println("isSort");
                break;
            }
        }

        return aar;
    }

    private void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
