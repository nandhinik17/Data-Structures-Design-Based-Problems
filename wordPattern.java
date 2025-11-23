*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false

 */






class Solution {
    public boolean wordPattern(String pattern, String s) {
       
        String str[] = s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        Map<Character, String> charToWord = new HashMap<Character, String>();
         Map<String, Character> wordToChar = new HashMap<String, Character>();
        for(int i=0; i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String value = str[i];
          if(!charToWord.containsKey(ch)){
              charToWord.put(ch, value);
          }
          else{
            if(!charToWord.get(ch).equals(value)){
                return false;
            }
            
          }
          if(!wordToChar.containsKey(value)){
              wordToChar.put(value, ch);
          }
          else{
            if(!wordToChar.get(value).equals(ch)){
                return false;
            }
            
          }
           
            
        }


        return true;
    }
}
