
/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]*/

class topKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
       // List<Integer> resList = new ArrayList<Integer>();
       int res[] = new int[k];
        for(int s: nums){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, map.get(s)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b)-> b.getValue()-a.getValue());
        int i=0;
        for(Map.Entry<Integer, Integer> e: list){
            res[i++]= e.getKey();
            k--;
            if(k==0){
                break;
            }
        }

        return res;
    }
}
