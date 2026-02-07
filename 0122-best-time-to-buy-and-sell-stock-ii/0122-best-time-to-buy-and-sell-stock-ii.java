class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int[] arr=new int[l];
        
        for(int i=0;i<l-1;i++){
            arr[i]=prices[i+1]-prices[i];
        }
        //arr[-1]=0;
        int s=0;
        for(int i=0;i<l;i++){
            if(arr[i]>0){
                s+=arr[i];
            }
        }
        return s;
    }
}