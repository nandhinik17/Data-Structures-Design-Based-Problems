import java.util.*;

/*Write a method that takes an ArrayList of integers and a rotation count as input, and rotates the elements of the ArrayList to the right by the specified count. For example, rotating [1, 2, 3, 4, 5] by 2 would result in [4, 5, 1, 2, 3].-*/
public class listRotation {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>();
     Collections.addAll(list, 1, 2, 3, 4, 5);
     
     Collections.reverse(list);
    // System.out.println(list);
     
     Collections.reverse(list.subList(0, 2));
     Collections.reverse(list.subList(2, list.size()));
     
    System.out.println(list);
     
  }
}
