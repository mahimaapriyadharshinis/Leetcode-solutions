import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        Set<Integer> arr = new HashSet<>();   
        List<Integer> arr1 = new ArrayList<>();  

        for (int i = 0; i < l; i++) {
            arr.add(nums[i]);
        }

        for (int j = 1; j <= l; j++) {
            if (!arr.contains(j)) {
                arr1.add(j);
            }
        }

        return arr1;
    }
}
