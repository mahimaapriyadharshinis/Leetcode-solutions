class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int cp=0;
        int cn=0;
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                cp++;
            }else{
                cn++;
            }
        }
        int f1=0;
        int f2=0;
        int[] p=new int[cp];
        int[] n=new int[cn];
        int[] arr=new int[l];
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                p[f1++]=nums[i];
            }else{
                n[f2++]=nums[i];
            }
        }
        int flagp=0;
        int flagn=0;
        int flag=0;
        while(flag<l){
            if(flagp<=cp){
                arr[flag++]=p[flagp++];
            }
            if(flagn<=cn){
                arr[flag++]=n[flagn++];
            }
        }
        return arr;
    }
}