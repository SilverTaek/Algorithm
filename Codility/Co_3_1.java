// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        long sum = sumStartOneTo(A.length + 1);
        for(int i=0; i<A.length; i++){
            sum -= A[i];
        }
        return (int) sum;
    }
    private long sumStartOneTo(int n) {
        return ((long)n * (n + 1)) / 2;
    }
}
