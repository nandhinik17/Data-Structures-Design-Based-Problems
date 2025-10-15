import java.util.*;

public class SeondMostRepCharInString   {

    public static void main(String[] args) {
      String str = "appplee";
      //op -e
      Map<Character, Integer> map = new TreeMap<Character, Integer>();
      for(char ch: str.toCharArray()){
       if(!map.containsKey(ch)){
         map.put(ch, 1);
       }
       else{
         map.put(ch, map.get(ch)+1);
       }
      }
     
     List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
     System.out.println("Before Sorting " + list);
     list.sort((a, b)-> b.getValue()-a.getValue());
     System.out.println("After Sorting" + list);
     System.out.println("Size of the List " + list.size());
     System.out.println(list.get(1));
      
    }
}




