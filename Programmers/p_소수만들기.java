import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(calc(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public static boolean calc(int sum) {
        boolean bol = true;
        
        for(int i=2; i<sum; i++) {
            if(sum % i == 0){
                bol = false;
                break;
            }
        }
        return bol;
    }
}