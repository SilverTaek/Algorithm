// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	static int zero, one, temp, ans = 0;
    public int solution(int N) {
        
        String binary = Integer.toBinaryString(N);

        int leng = binary.length();

        for(int i=0; i < leng; i++){
            if(binary.charAt(i) == '0') {
                zero++;
            }
            else if(binary.charAt(i) == '1') {
                one++;
                if(temp < zero) {
                    temp = zero;
                }
                zero = 0;
            }
        }

        if(one < 2){
            return ans = 0;
        }else {
            ans = temp;
        }
        return ans;
    }
}
