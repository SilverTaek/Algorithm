import java.util.*;
class Solution {
    static int give_up1[] = {1,2,3,4,5};
    static int give_up2[] = {2,1,2,3,2,4,2,5};
    static int give_up3[] = {3,3,1,1,2,2,4,4,5,5};
    static int cnt1 = 0;
    static int cnt2 = 0;
    static int cnt3 = 0;
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        for(int i=0; i<answers.length; i++) {
            if(give_up1[i%give_up1.length] == answers[i]) cnt1++;
            if(give_up2[i%give_up2.length] == answers[i]) cnt2++;
            if(give_up3[i%give_up3.length] == answers[i]) cnt3++;
        }
        
        int max = Math.max(Math.max(cnt1, cnt2),cnt3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == cnt1) list.add(1);
        if(max == cnt2) list.add(2);
        if(max == cnt3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}