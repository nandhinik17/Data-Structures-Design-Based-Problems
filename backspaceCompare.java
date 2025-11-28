/*Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "". */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
            else{
                if(stack.size()>0)
                stack.pop();
            }
        }
         Stack<Character> stack1 = new Stack<Character>();
        for(char ch1: t.toCharArray()){
            if(Character.isLetter(ch1)){
                stack1.push(ch1);
            }
            else{
                if(stack1.size()>0)
                stack1.pop();
            }
        }
        if(stack1.size()!=stack.size()){
            return false;
        }

        for(int i=0; i<stack1.size(); i++){
            if(stack1.get(i)!=stack.get(i)){
                return false;
            }
        }

        return true;
    }
}
