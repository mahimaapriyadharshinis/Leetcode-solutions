class Solution {
    public int reverseBits(int n) {
        String s1 = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');  
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s = sb.toString();
        String[] arr = s.split("");
        int l = arr.length;
        int ans = 0;
        for(int i = 0; i < l; i++){
            if(arr[i].equals("1")){
                ans = ans + (int) Math.pow(2, 31 - i);  
            }
        }
        return ans;
    }
}
