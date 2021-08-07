// 각 구간별로 나눠서 절대값 뺀 값이 제일 작은 값을 출력하라

class Solution {
    public int solution(int[] A) {
    
    int sum_fromFirst = 0;
    int sum_toLast = 0;
 
    for (int i = 0; i < A.length; i++) {
        sum_toLast += A[i];
    } // A의 값을 다더한다.
 
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
