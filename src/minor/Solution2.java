package minor;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1)
            return A.length;

        int even = A[0];
        int odd = A[1];
        int start = 0, end = 0;

        for (int i = 2; i < A.length; ++i) {
            if (i % 2 == 0 && A[i] != even || i % 2 == 1 && A[i] != odd) {
                end = Math.max(end, i - start);
                start = i - 1;
                if (i % 2 == 0) {
                    even = A[i];
                    odd = A[i - 1];
                } else {
                    even = A[i - 1];
                    odd = A[i];
                }
            }
        }
        return Math.max(end, A.length - start);
    }
}
