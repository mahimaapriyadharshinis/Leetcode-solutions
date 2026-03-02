class Solution {
    public boolean check(int[] nums) {

        for(int i = 0; i < nums.length; i++) {

            int[] temp = new int[nums.length];

            
            for(int j = 0; j < nums.length; j++) {
                temp[(j + i) % nums.length] = nums[j];  
            }

            int c = 0;

            
            for(int k = 0; k < nums.length - 1; k++) {
                if(temp[k] <= temp[k + 1]) {
                    c++;
                }
            }

            if(c == nums.length - 1) {  
                return true;
            }
        }

        return false;
    }
}