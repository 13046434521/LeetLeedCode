package sort;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/8/12 16:34
 * 选择排序
 */

class SelectionSort extends Sort{
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }


    @Override
    public int[] sort(int[] arr){
        /**
         * 记录最小值得下标
         * 从左往右依次比较
         * 每比较一轮之后，把最小值下标对应的值和该轮初始时下标对应的值进行交换
         * 每一轮都会把当前最小值放到首位
         */

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }

        return arr;
    }

    public int[] sort2(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){

                }
            }



        }


        return arr;
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
}
