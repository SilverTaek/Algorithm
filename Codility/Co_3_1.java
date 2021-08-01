// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int leng = A.length;
        for(int i=0; i<leng; i++){
            if(i+1 != A[i]){
                return i+1;
            }
        }
        return 0;
    }
}
