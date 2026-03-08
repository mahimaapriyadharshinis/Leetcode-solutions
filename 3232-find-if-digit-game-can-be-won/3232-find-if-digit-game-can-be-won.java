class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int multi = 0;

        for(int n : nums){
            if(n < 10) single += n;
            else multi += n;
        }

        return single != multi;
    }
}