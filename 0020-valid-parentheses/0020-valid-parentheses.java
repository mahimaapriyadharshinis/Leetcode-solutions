class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] arr = new char[n];   // our own stack
        int top = -1;               // top pointer

        for (int i = 0; i < n; i++) {
            char p = s.charAt(i);

            // push opening brackets
            if (p == '(' || p == '{' || p == '[') {
                arr[++top] = p;
            } else { // closing bracket
                if (top == -1) return false; // nothing to match
                char open = arr[top--];      // pop
                if ((p == ')' && open != '(') ||
                    (p == '}' && open != '{') ||
                    (p == ']' && open != '[')) {
                    return false;            // wrong pairing
                }
            }
        }

        return top == -1; // all opened brackets matched
    }
}
