package LeetCode_09_24;

/**
 * @author jtl
 * @date 2021/9/24 11:32
 * 题目：74. 搜索二维矩阵
 * 网址：https://leetcode-cn.com/problems/search-a-2d-matrix/
 * 思路：二维矩阵。缩小范围
 * 状态：完成
 */

class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int index = 0;
        for (int i=0;i<row;i++){
            if (matrix[i][0]==target){
                index = i;
            }else if (matrix[i][0]>target){
                break;
            }
            index = i;
        }

        for (int i=0;i<col;i++){
            if (matrix[index][i]==target){
                return true;
            }else if (matrix[index][i]>target){
                return false;
            }
        }

        return false;
    }
}
