// A의 배열 중 X까지 갔을 때 앞에 있는 값들을 모두 거쳐야할 때 값을 구해라
// 거치지않는다면 -1을 출력
import java.util.*;

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