// A 배열 값들 중에서 순서대로 증가할 때 순서가 아닌 값을 출력하라
// 풀이 예시) 10 -> 10 * 11 / 2 -> 55 따라서 6이 없다면 55 - A 배열값들 -> 정답

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
