import java.util.*;

public class CountWordFreqInText   {

    public static void main(String[] args) {
      String str = "apple banana apple grape banana apple";
      String s[] = str.split(" ");
      Map<String, Integer> map = new TreeMap<String, Integer>();
      for(String word: s){
        if(!map.containsKey(word)){
          map.put(word, 1);
        }
        else{
          map.put(word, map.get(word)+1);
        }
      }
      
      for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.println(e.getKey() + " "+ e.getValue());
      }
      
      
      
    }
}




