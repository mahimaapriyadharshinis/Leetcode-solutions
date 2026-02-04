class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        String[] arr=binary.split("");
        int l=arr.length;
        int c=0;
        for(int i=0;i<l;i++){
            if(arr[i].equals("1")){
                c++;
            }
        }
        return c;
    }
}