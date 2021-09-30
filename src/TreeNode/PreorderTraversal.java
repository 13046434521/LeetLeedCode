package TreeNode;

import com.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jtl
 * @date 2021/9/27 16:53
 * 题目：
 * 网址：
 * 思路：
 * 状态：
 */

class PreorderTraversal {
   public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      porder(root,list);
      return list;
   }

   public void porder(TreeNode node, List list){
      if(node==null){
         return;
      }

      list.add(node.val);
      porder(node.left,list);
      porder(node.right,list);
   }
}
