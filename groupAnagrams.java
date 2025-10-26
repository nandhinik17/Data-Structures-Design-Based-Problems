/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]*/


class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);              
       String str = new String(chars);
        map.put(str, new ArrayList<String>());
        }
        for(String s1: strs){
        char[] chars1 = s1.toCharArray(); 
        Arrays.sort(chars1);              
       String str1 = new String(chars1);
        map.get(str1).add(s1);
        }

     System.out.println(map);   
return new ArrayList<>(map.values());

    }
}
