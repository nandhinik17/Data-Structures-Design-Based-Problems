import java.util.*;

public class GroupStudentByGrades   {

    public static void main(String[] args) {
      
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("Nandhini", 200);
      map.put("kavi", 200);
      map.put("Gowtham", 300);
      map.put("Hindu", 250);
      map.put("Nivi", 660);
      map.put("Midhu", 660);
      
      Map<Integer, List<String>> result = new HashMap<Integer, List<String>>();
      
      for(Map.Entry<String, Integer> e: map.entrySet()){
        String name = e.getKey();
        Integer score = e.getValue();
        
        if(!result.containsKey(score)){
          List<String> list = new ArrayList<String>();
          list.add(name);
          result.put(score, list);
        }
        else{
          result.get(score).add(name);
        }
      }
      
      for(Map.Entry<Integer, List<String>> e1: result.entrySet()){
        System.out.println("Student who has "+ e1.getKey() + " was "+ e1.getValue());
      }
      
      
    }
}




