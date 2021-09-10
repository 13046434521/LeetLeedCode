package sort;

import java.util.Arrays;

/**
 * @author jtl
 * @date 2021/8/18 16:43
 * 归并排序
 * 将数组从中间分开，将左右部分分别进行排序
 * 另取一个数组空间。
 * 将两个排好序的左右部分分别用一个指针指向开始的位置。进行比较。
 * 将小于的值存储到新的数组空间中，如若左右相等，存入左边的值。同时指针后移。
 * 排好序后，将数据拷贝回原数组中。
 */

class MergeSort extends Sort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(data));
        Sort mergeSort = new MergeSort();
        int[] res = mergeSort.sort(data);
        System.out.println(Arrays.toString(res));
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(res));
    }


//    @Override
//    public int[] sort(int[] aar) {
//        int left = 0;
//        int right = aar.length - 1;
//
//        return process(aar,left,right);
//    }
//
//    public int[] process(int[] aar, int left, int right) {
//        if (left == right) {
//            return new int[]{aar[left]};
//        }
//        int mid = left + ((right - left) >> 2);
//
//        int[] leftData =  process(aar, left, mid);
//        int[] rightData = process(aar, mid + 1, right);
//        return merge(leftData,rightData);
//    }
//
//    public int[] merge(int[] arr, int[] data) {
//        int l1 = arr.length;
//        int l2 = data.length;
//        int[] res = new int[l1+l2];
//
//        int s1 = 0;
//        int s2 = 0;
//        int index = 0;
//        while (s1<l1&&s2<l2){
//            if (arr[s1]<=data[s2]){
//                res[index++] = arr[s1++];
//            }else{
//                res[index++] = data[s2++];
//            }
//        }
//
//        while (s1<l1){
//            res[index++] = arr[s1++];
//        }
//
//        while (s2<l2){
//            res[index++] = data[s2++];
//        }
//
//        return res;
//    }
//
//


    @Override
    public int[] sort(int[] arr) {
        process(arr,0,arr.length-1);
        return arr;
    }

    public void process(int[] aar,int left,int right){
        if (left==right){
            return;
        }
        int mid = left+((right-left)>>1);

        process(aar,left,mid);
        process(aar,mid+1,right);

        merge(aar,left,mid,right);
    }
    private int nums = 0;
    public int[] merge(int[] aar,int L,int M,int R){
        System.out.println("---------------mergeStart:"+(++nums)+"-----------------");
        System.out.println(L+"  "+M+"  "+R);
        int[] data = new int[R-L+1];
        int p1 = L;
        int p2 = M+1;
        int i=0;
        while (p1<=M&&p2<=R){
            data[i++] = aar[p1]>aar[p2]?aar[p1++]:aar[p2++];
        }
        while (p1<=M){
            data[i++]=aar[p1++];
        }
        while (p2<=R){
            data[i++]=aar[p2++];
        }
        for (int j=0;j<data.length;j++){
            aar[L+j]=data[j];
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(aar));
        System.out.println("---------------mergeDivider:"+(nums)+"-----------------\n");
        return aar;
    }
}
