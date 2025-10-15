import java.util.*;

public class GrpWordsByLength   {

    public static void main(String[] args) {
      String str = "apple banana pear grape";
      String s[] = str.split(" ");
      Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();
      for(String word: s){
        Integer len = word.length();
        
        if(!map.containsKey(len)){
          List<String> list = new ArrayList<String>();
          list.add(word);
          map.put(len, list);
        }
        else{
          map.get(len).add(word);
        }
      }
      
      for(Map.Entry<Integer, List<String>> e : map.entrySet()){
        System.out.println(e.getKey() + " "+ e.getValue());
      }
      
      
      
    }
}




