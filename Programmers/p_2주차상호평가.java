import java.util.*;

class Solution {
    
    
    public String solution(int[][] scores) {
        String answer = "";
        
        for(int i=0; i<scores.length; i++){
            boolean sameScore = true;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int ans = 0;
            int divide = 0;
            double avg;
            int ownScore = scores[i][i];
            for(int j=0; j<scores.length; j++){
                if(i != j && ownScore == scores[j][i]){
                    sameScore = false;
                }
                if(scores[j][i] > max) {
                    max = scores[j][i];
                }
                if(scores[j][i] < min) {
                    min = scores[j][i];
                }
                
                sum += scores[j][i];
                divide++;
            }
            
            if(sameScore && (max == ownScore || min == ownScore)) {
                sum -= ownScore;
                divide--;
            }
               
            avg = (double)sum / (double)divide;
            answer += getRank(avg);
        }
        return answer;
    }
    public static String getRank(double score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 50) {
            return "D";
        }

        return "F";
    }
}