import java.util.*;
import java.util.stream.Collectors;


public class cricketPlayers   {

    public static void main(String[] args) {
     Map<String, Integer> map = new HashMap<String, Integer>();
     Map<Integer, List<String>> result = new HashMap<Integer, List<String>>();
     map.put("Vijay", 200);
     map.put("Arun", 200);
     map.put("Rakhul", 100);
     map.put("Virat", 500);
     map.put("Sachin", 1000);
     map.put("Dhoni", 110);
     map.put("Gowtham", 110);
     
     for(Map.Entry<String, Integer> e : map.entrySet()){
      
       Integer value = e.getValue();
       String name = e.getKey();
       if(!result.containsKey(value)){
       List<String> list = new ArrayList<>();
       list.add(name);
       result.put(value, list);
       }
       else{
         result.get(value).add(name);
       }
       
     }
 
for(Map.Entry<Integer, List<String>> e1 : result.entrySet()){
            System.out.println("Player's Name who has " + e1.getKey() + " was "+ e1.getValue() );
  }
}
}




