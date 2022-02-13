package minor;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[][] A) {
        // write your code in Java SE 8
        int row = A.length;
        int col = A[0].length;
        int c=1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if((i>0 && A[i][j]!=A[i-1][j]) && (j>0 && A[i][j]!=A[i][j-1])){
                   c++;
                }

            }
        }
        return c;
    }
}
