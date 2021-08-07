// D만큼 이동할 수 있는데 X에서 Y를 갈 때 최소 Y와 같거나 커야할 때, 최솟값을 구해라

class Solution {
    public int solution(int X, int Y, int D) {
        if(X>=Y) return 0;

        if(((Y-X) % D) == 0){
            return (Y-X)/D;
        } else{
            return (Y-X)/D + 1;
        }
    }
}
