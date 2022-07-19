package LeetCode_09_27;

import com.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jtl
 * @date 2021/9/27 17:01
 * 题目：144. 二叉树的前序遍历
 * 网址：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * 思路：前序遍历，顺序：中->左->右。递归或者迭代
 * 状态：完成
 */

class PreorderTraversal {
   public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      preorder(root,list);
      return list;
   }

   public void preorder(TreeNode node,List<Integer> list){
      if (node == null){
         return;
      }

      list.add(node.val);
      preorder(node.left,list);
      preorder(node.right,list);
   }
}
