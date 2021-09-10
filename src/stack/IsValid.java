package stack;

import java.util.Stack;

/**
 * @author jtl
 * @date 2021/9/2 18:26
 */

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
// 示例 4：
//
//
//输入：s = "([)]"
//输出：false
//
//
// 示例 5：
//
//
//输入：s = "{[]}"
//输出：true
//
//
//
// 提示：
//
//
// 1 <= s.length <= 104
// s 仅由括号 '()[]{}' 组成
//
// Related Topics 栈 字符串
// 👍 2607 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class IsValid {
    public static void main(String[] args) {
        IsValid i = new IsValid();
        System.out.println(i.isValid("]"));
    }

    public boolean isValid(String s) {
        Stack<String> stack = new Stack();
        for (String data : s.split("")){
            if ("(".equals(data)){
                stack.push(")");
            }else if ("[".equals(data)){
                stack.push("]");
            }else if ("{".equals(data)){
                stack.push("}");
            }else if (stack.isEmpty()||!stack.pop().equals(data)){
                return false;
            }
        }

        return true;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack();
        for (char data : s.toCharArray()){
            if ('('==(data)){
                stack.push(')');
            }else if ('['==data){
                stack.push(']');
            }else if ('{'==data){
                stack.push('}');
            }else if (stack.isEmpty()||!stack.pop().equals(data)){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

