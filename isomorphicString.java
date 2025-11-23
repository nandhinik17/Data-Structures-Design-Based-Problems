/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

*/



class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> stotMap = new HashMap<Character, Character>();
        Map<Character, Character> ttosMap = new HashMap<Character, Character>();

        for(int i=0; i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!stotMap.containsKey(schar)){
                stotMap.put(schar, tchar );
            }
            else{
                if(!stotMap.get(schar).equals(tchar)){
                    return false;
                }
            }
            if(!ttosMap.containsKey(tchar)){
                ttosMap.put(tchar, schar );
            }
            else{
                if(!ttosMap.get(tchar).equals(schar)){
                    return false;
                }
            }
        }

        return true;


    }
}
