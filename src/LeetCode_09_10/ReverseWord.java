package LeetCode_09_10;

/**
 * @author jtl
 * @date 2021/9/10 11:25
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */

class ReverseWord {
    public String reverseWords(String s) {
        int slow = 0;
        int fast = 0;
        char[] data =s.toCharArray();
        while (fast<data.length){
            if (data[fast]==' '){
                reverseString(data,slow,fast);
                slow=fast;
            }


            fast++;
        }
        
        
        return new String(data);
    }

    public void reverseString(char[] data,int slow,int fast){
        int left = slow;
        int right = fast;
        while (left<right){
            swap(data,left,right);
            left++;
            right--;
        }
    }

    public void swap(char[] data,int left,int right){
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
