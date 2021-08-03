// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
    
    int sum_fromFirst = 0;
    int sum_toLast = 0;
 
    for (int i = 0; i < A.length; i++) {
        sum_toLast += A[i];
    }
 
    int minDiff = Integer.MAX_VALUE;
 
    for (int p = 1; p < A.length; p++) {
        sum_fromFirst += A[p - 1];
        sum_toLast -= A[p - 1];
 
        int diff = Math.abs(sum_fromFirst - sum_toLast);
 
        if (diff < minDiff) {
            minDiff = diff;
        }
    }
 
    return minDiff;
    }
}
