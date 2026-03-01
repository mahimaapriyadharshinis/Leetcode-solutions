import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        // Step 1: Count frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // Step 2: Use a PriorityQueue (Max Heap)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]   // sort by frequency descending
        );
        
        for(int key : map.keySet()){
            pq.add(new int[]{key, map.get(key)});
        }
        
        // Step 3: Extract top k elements
        int[] result = new int[k];
        
        for(int i = 0; i < k; i++){
            result[i] = pq.poll()[0];
        }
        
        return result;
    }
}