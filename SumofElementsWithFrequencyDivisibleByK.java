/*ou are given an integer array nums and an integer k.

Return an integer denoting the sum of all elements in nums whose frequency is divisible by k, or 0 if there are no such elements.

Note: An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by k.

 

Example 1:

Input: nums = [1,2,2,3,3,3,3,4], k = 2

Output: 16

Explanation:

The number 1 appears once (odd frequency).
The number 2 appears twice (even frequency).
The number 3 appears four times (even frequency).
The number 4 appears once (odd frequency).
So, the total sum is 2 + 2 + 3 + 3 + 3 + 3 = 16.*/



class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }
            else{
                map.put(n, map.get(n)+1);
            }
        }
        int sum =0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()%k==0){
                int val = e.getValue();
                int keyValue = e.getKey();
                while(val!=0){
                    sum = sum+ keyValue;
                    val--;
                }
            }
        }

        return sum;
    }
}
