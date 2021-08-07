// 페어하지 않는 값을 찾아라
// XOR로 찾음

class Solution {
    public int solution(int[] A) {
        int result = 0;

        for(int i=0; i<A.length; i++){
            result = result ^ A[i];
        }

        return result;
    }
}