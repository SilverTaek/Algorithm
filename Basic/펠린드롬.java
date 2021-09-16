import java.util.*;

class Solution {

	public static int solution(String plain) {
        int[][] arr = new int[plain.length()][plain.length()];
        int answer = plain.length();

        for (int i = plain.length() - 1; i >= 0; i--) {
            for (int j = i; j < plain.length(); j++) {
                if(i == j) {
                	arr[i][j] = 0;
                }
                else {
                    if (plain.charAt(i) == plain.charAt(j)) {
                    	arr[i][j] = arr[i+1][j-1];
                    } else {
                    	arr[i][j] = Math.min(arr[i+1][j], arr[i][j-1]) + 1;
                    }
                }
            }
        }
        
        answer += arr[0][plain.length()-1];
        return answer;
	}
}