class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            int currentNum = num;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum /= 10;
            }
            num = sum;
        }
        return num;
    }
}