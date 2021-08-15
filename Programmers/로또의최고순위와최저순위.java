// 1. win_nums, lottos가 얼마나 같은 지 세서 저장
// 2. win_nums, lottos가 같거나 0이 없으면 그대로 answer를 출력
// [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        
        for(int l : lottos){
            if(l == 0){
                zero++;
            }else{
                for(int i : win_nums){
                    if(l == i){
                        match++;
                    }
                }
            }
        }
        int min = match;
        int max = zero + match;
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}