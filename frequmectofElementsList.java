/*Given an array arr[] of positive integers which may contain duplicate elements, return the frequency of each distinct element.

Examples:

Input: arr[] = [1, 2, 2, 3, 3, 5]
Output: [[1, 1], [2, 2], [3, 2], [5, 1]]
Explaiantion: Here element 1 and 5 occur 1 times, 2 and 3 occur 2 times.
Input: arr[] = [1, 5, 6, 7, 7]
Output: [[1, 1], [5, 1], [6, 1], [7, 2]]
Explanation: Here element 1, 5 and 6 occur 1 times, 7 occur 2 times.*/


class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
         ArrayList<ArrayList<Integer>> list = new  ArrayList<ArrayList<Integer>>();
         
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         
         for(int i =0; i<arr.length; i++){
             if(!map.containsKey(arr[i])){
                 map.put(arr[i], 1);
             }
             else{
                 map.put(arr[i], map.get(arr[i])+1);
             }
         }
         for(Map.Entry<Integer, Integer> e: map.entrySet()){
             ArrayList<Integer> a = new ArrayList<Integer>();
             a.add(e.getKey());
             a.add(e.getValue());
             list.add(a);
         }
         return list;
    }
}
