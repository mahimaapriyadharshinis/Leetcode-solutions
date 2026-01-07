class Solution {
    public int change(int amount, int[] coins) {
        int[] ways = new int[amount + 1];
        ways[0] = 1;

        for (int coin : coins) {
            for (int currentAmount = coin; currentAmount <= amount; currentAmount++) {
                ways[currentAmount] = ways[currentAmount] + ways[currentAmount - coin];
            }
        }

        return ways[amount];
    }
}
