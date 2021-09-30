package LeetCode_09_28;

/**
 * @author jtl
 * @date 2021/9/28 15:13
 * 题目：剑指 Offer 04. 二维数组中的查找
 * 网址：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * 思路：
 * 状态：未完成
 */

class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int rowIndex = 0;
        for (int i = 0; i < row; i++) {
            if (matrix[i][col-1]>target){
                rowIndex = i;
                break;
            }else if (matrix[i][col-1]==target){
                System.out.println(i+"  "+(col-1));
                return true;
            }
        }

        int rowIndex1 = 0;
        for (int j = row-1; j >= 0 ; j--) {
            if (matrix[row-1][j]>target){
                rowIndex1 = j;
                break;
            }else if (matrix[row-1][j]==target){
                System.out.println((row-1)+"  "+(j));
                return true;
            }
        }

        for (int i = rowIndex; i <=rowIndex1 ; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j]==target){
                    System.out.println(i+"  "+j);
                    return true;
                }
            }
        }


        return false;
    }
}
