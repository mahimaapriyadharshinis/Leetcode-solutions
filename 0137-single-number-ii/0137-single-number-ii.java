class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        
        for (int x : nums)
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        
        for (int x : nums)
            if (cnt.get(x) % 3 != 0)
                return x;
        
        return -1;
    }
}
