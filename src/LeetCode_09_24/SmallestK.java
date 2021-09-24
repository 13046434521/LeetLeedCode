package LeetCode_09_24;

/**
 * @author jtl
 * @date 2021/9/23 18:57
 * 题目：面试题 17.14. 最小K个数
 * 网址：https://leetcode-cn.com/problems/smallest-k-lcci/
 * 思路：归并排序
 * 状态：完成
 */

class SmallestK {
    public int[] smallestK(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        sort(arr,left,right);
        int[] res = new int[k];

        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public void sort(int[] arr,int left,int right){
        if (arr.length==0||left == right){
            return;
        }
        int middle = left+((right-left)>>1);
        sort(arr,left,middle);
        sort(arr,middle+1,right);
        merge(arr,left,middle,right);

    }

    public void merge(int[] arr,int left,int middle,int right){
        int[] res = new int[right-left+1];
        int index = 0;
        int p1 = left;
        int p2 = middle+1;
        while (p1<=middle && p2<=right){
            if (arr[p1]<=arr[p2]){
                res [index++] = arr[p1++];
            }else{
                res [index++] = arr[p2++];
            }
        }
        while (p1<=middle){
            res [index++] = arr[p1++];
        }
        while ( p2<=right){
            res [index++] = arr[p2++];
        }

        for (int i = 0; i < res.length; i++) {
            arr[left+i] = res[i];
        }
    }
}
