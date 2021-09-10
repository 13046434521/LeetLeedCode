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
        bubbleSort.sort2(data);
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


    public int[] sort2(int[] aar){
        for (int i = 0;i<aar.length;i++){
            for (int j = 0;j<aar.length-1;j++){
                if (aar[j]>aar[j+1]) {
                    swap(aar, j, j + 1);
                }
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
