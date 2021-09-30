package LeetCode_09_27;

import com.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jtl
 * @date 2021/9/27 17:22
 * 题目：94. 二叉树的中序遍历
 * 网址：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 思路：左->中->右
 * 状态：完成
 */

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
