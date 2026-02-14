import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // Add all stones to heap
        for (int s : stones) {
            pq.add(s);
        }

        // Keep smashing two largest stones
        while (pq.size() > 1) {
            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            if (y != x) {
                pq.add(y - x);
            }
        }

        // If empty, return 0, else return last stone
        return pq.isEmpty() ? 0 : pq.poll();
    }
}