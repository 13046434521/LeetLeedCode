import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import sort.Sort;

/**
 * @author jtl
 * @date 2021/9/3 14:19
 */

class test extends Sort {
    public int[] smallestK(int[] arr, int k) {

//        sort(arr);

        int[] data = Arrays.copyOf(arr, k);
        return data;
    }

    int b = 0;

    public static void main(String[] args) {
        System.out.println(1 / 10);
        int[] arr = new int[]{0,1,1};

        test test = new test();
        System.out.println(Arrays.toString(test.moveZeroes(arr)));


//        System.out.println(Arrays.toString(test.sort(data)));
//        System.out.println(Arrays.toString(test.sortedSquares(arr)));
    }

    public int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Math.abs(nums[i]);
        }

        sort(temp, 0, temp.length - 1);
        int[] data = new int[temp.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[i] * temp[i];
        }


        return data;
    }

    public void sort(int[] num, int left, int right) {

        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        sort(num, left, mid);
        sort(num, mid + 1, right);
        merge(num, left, mid, right);
    }

    private int nums = 0;

    public void merge(int[] num, int left, int mid, int right) {
        System.out.println("---------------mergeStart:" + (++nums) + "-----------------");
        System.out.println(left + "  " + mid + "  " + right);
        int index1 = left;
        int index2 = mid + 1;
        int i = 0;
        int[] res = new int[right - left + 1];
        while (index1 <= mid && index2 <= right) {
            int num1 = Math.abs(num[index1]);
            int num2 = Math.abs(num[index2]);
            if (num1 <= num2) {
                res[i++] = num1;
                index1++;
            } else {
                res[i++] = num2;
                index2++;
            }
//            res[i++]=num1<=num[index2]?num[index1++]:num[index2++];
        }

        while (index1 <= mid) {
            res[i++] = num[index1++];
        }
        while (index2 <= right) {
            res[i++] = num[index2++];
        }
        for (int j = 0; j < res.length; j++) {
            num[left + j] = res[j];
        }
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(num));
        System.out.println("---------------mergeDivider:" + (nums) + "-----------------\n");
    }


    public void rotate(int[] nums, int k) {

        int count = k % nums.length;
        int dest = nums.length - 1;
        int src = dest - 1;

        for (int i = 0; i < count; i++) {
            swap(nums, src, dest);
        }
    }

    public void swap(int[] arr, int src, int dest) {
        b++;
        if (src < 0) {
            return;
        }

        int temp = arr[src];
        arr[src--] = arr[dest];
        arr[dest--] = temp;

        swap(arr, src, dest);
    }

    @Override
    public int[] sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        sort(arr, left, right);
        return arr;
    }

    public int[] moveZeroes(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p1++] = nums[i];
            }
        }

        for (int i = p1; i < nums.length; i++) {
            nums[i] = 0;
        }


        return nums;
    }


    public void reverseString(char[] s) {

    }
}
