class Solution {
    public int findMaximumXOR(int[] nums) {
       int l=nums.length;
       int max=0;
       for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
           int p=nums[i]^nums[j];
           if(p>max)
           max=p;
        }
       } 
       return max;
    }
}