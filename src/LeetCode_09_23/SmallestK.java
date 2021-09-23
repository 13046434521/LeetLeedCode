package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 18:57
 * 题目：面试题 17.14. 最小K个数
 * 网址：https://leetcode-cn.com/problems/smallest-k-lcci/
 * 思路：归并排序
 * 状态：
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
        if (left == right){
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
        int start = left;
        while (left<=middle-1 && middle<=right){
            if (arr[left]<=arr[middle]){
                res [index++] = arr[left++];
            }else{
                res [index++] = arr[middle++];
            }
        }
        while (left<=middle-1){
            res [index++] = arr[left++];
        }
        while ( middle<=right){
            res [index++] = arr[middle++];
        }

        for (int i = 0; i < res.length; i++) {
            arr[start++] = res[i];
        }
    }
}
