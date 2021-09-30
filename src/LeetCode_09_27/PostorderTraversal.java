package LeetCode_09_27;

import com.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jtl
 * @date 2021/9/27 17:18
 * 题目：145. 二叉树的后序遍历
 * 网址：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * 思路：左->右->中
 * 状态：完成
 */

class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        porder(root,list);
        return list;
    }
    public void porder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }

        porder(root.left,list);
        porder(root.right,list);
        list.add(root.val);
    }
}
