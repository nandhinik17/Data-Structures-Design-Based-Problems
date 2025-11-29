/*Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        for(char ch : num.toCharArray()){
            int num1 = ch-'0';
         
                while(!stack.isEmpty() && stack.peek()>num1 && k>0){
                  stack.pop();
                  k--;
                }
                stack.push(num1);
           
        }

        while(k>0){
            stack.pop();
            k--;
        }

        String str = "";
        for(int i=0;i<stack.size(); i++){
           
            str = str+ stack.get(i);
           
        }
        while(str.length()>0 && str.charAt(0)=='0'){
            str = str.substring(1);
        }
        if(str.length()==0){
            str = "0";
        }
        return str;
    }
}
