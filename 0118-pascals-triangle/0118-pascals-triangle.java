import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++) {

                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = matrix.get(i - 1).get(j - 1) 
                            + matrix.get(i - 1).get(j);
                    row.add(val);
                }
            }

            matrix.add(row);
        }

        return matrix;
    }
}