package sort;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/8/13 17:24
 * 插入排序
 */

class InsertionSort extends Sort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }


    @Override
    public int[] sort(int[] arr) {
        /**
         * 插入排序
         * 类似扑克牌摆排
         * 每次都把刚摸到的牌和它前一位的牌进行排序。
         * 如果小于前一位的牌，则进行交换。直到等于或者大于前一位的牌
         * 进行下一轮。直到 i<arr.length
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int j, int i) {
        arr[j] = arr[j]^arr[i];
        arr[i] = arr[j]^arr[i];
        arr[j] = arr[j]^arr[i];
    }
}
