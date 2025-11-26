/*wo strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.

Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
The frequency of a letter x is the number of times it occurs in the string.
Example 1:
Input: word1 = "aaaa", word2 = "bccb"
Output: false
Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
The difference is 4, which is more than the allowed 3.
Example 2:
Input: word1 = "abcdeef", word2 = "abaaacc"
Output: true
Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
- 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
- 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
- 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
- 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
- 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
- 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.
Example 3:
Input: word1 = "cccddabba", word2 = "babababab"
Output: true
Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
- 'a' appears 2 times in word1 and 4 times in word2. The difference is 2.
- 'b' appears 2 times in word1 and 5 times in word2. The difference is 3.
- 'c' appears 3 times in word1 and 0 times in word2. The difference is 3.
- 'd' appears 2 times in word1 and 0 times in word2. The difference is 2.*/

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();


      for(char ch: word1.toCharArray()){
           if(!map1.containsKey(ch)){
            map1.put(ch, 1);
           }
           else{
            map1.put(ch, map1.get(ch)+1);
           }
      }
      for(char ch1: word2.toCharArray()){
         if(!map2.containsKey(ch1)){
            map2.put(ch1, 1);
           }
           else{
            map2.put(ch1, map2.get(ch1)+1);
           }
      }

      for(char ch2: word1.toCharArray()){
        int b;
        if(map2.containsKey(ch2)){
         b =  map2.get(ch2);
        }
        else{
                b =0;
        }
         int a = map1.get(ch2);
        
         if(Math.abs(a-b)>3){
                return false;
         }
      }
      for(char ch3: word2.toCharArray()){
        int b;
        if(map1.containsKey(ch3)){
         b =  map1.get(ch3);
        }
        else{
                b =0;
        }
         int a = map2.get(ch3);
        
         if(Math.abs(a-b)>3){
                return false;
         }
      }

      return true;

    }
}
