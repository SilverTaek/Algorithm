import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> per = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] <= X) per.add(A[i]);
            if(per.size() == X) return i;
        }
        return -1;
    }
}