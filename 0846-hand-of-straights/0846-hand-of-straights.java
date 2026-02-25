import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int x : hand) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        while (!map.isEmpty()) {
            int start = map.firstKey();

            for (int i = 0; i < groupSize; i++) {
                int key = start + i;
                if (!map.containsKey(key)) {
                    return false;
                }

                int cnt = map.get(key);
                if (cnt == 1) {
                    map.remove(key);
                } else {
                    map.put(key, cnt - 1);
                }
            }
        }

        return true;
    }
}