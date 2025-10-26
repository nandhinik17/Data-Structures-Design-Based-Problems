/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false*/


class uniqueNumofOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: arr){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }
            else{
                map.put(n, map.get(n)+1);
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int n1: map.values()){
            if(!set.add(n1)){
                return false;
            }
        }
        return true;
    }
}
