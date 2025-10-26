/*Given a string s. Return all the words vertically in the same order in which they appear in s.
Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
Each word would be put on only one column and that in one column there will be only one word.

 

Example 1:

Input: s = "HOW ARE YOU"
Output: ["HAY","ORO","WEU"]
Explanation: Each word is printed vertically. 
 "HAY"
 "ORO"
 "WEU"
Example 2:

Input: s = "TO BE OR NOT TO BE"
Output: ["TBONTB","OEROOE","   T"]
Explanation: Trailing spaces is not allowed. 
"TBONTB"
"OEROOE"
"   T"
Example 3:

Input: s = "CONTEST IS COMING"
Output: ["CIC","OSO","N M","T I","E N","S G","T"]*/


class PrintWordsVertically {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<String>();
        String words[] = s.split(" ");
        int maxLength = 0;
        for(String s1: words){
            if(s1.length()>maxLength){
                maxLength= s1.length();
            }
        }

        for(int i=0; i<maxLength; i++){
            String str= "";
 for(String s2: words){
  
  if(s2.length()>i){
    str = str + s2.charAt(i);
  }
  else{
    str = str + " ";
  }
 }
 list.add(str.stripTrailing());
        }
        return list;
    }
}
