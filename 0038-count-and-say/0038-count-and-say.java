class Solution {
    public String countAndSay(int n) {
        String str = "1";
        
        for (int k = 2; k <= n; k++) {
            StringBuilder temp = new StringBuilder();
            int i = 0;
            
            while (i < str.length()) {
                int count = 1;
                
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                
                temp.append(count);
                temp.append(str.charAt(i));
                i++;
            }
            
            str = temp.toString();
        }
        
        return str;
    }
}