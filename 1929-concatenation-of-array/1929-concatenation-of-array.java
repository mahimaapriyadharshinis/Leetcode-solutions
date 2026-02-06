class Solution {
    public int[] getConcatenation(int[] nums) {
        int flag=0;
        int l=nums.length;
        int[] arr=new int[2*l];
        for(int i=0;i<l;i++){
            arr[flag++]=nums[i];
        }
        for(int i=0;i<l;i++){
            arr[flag++]=nums[i];
        }
        return arr;
    }
}