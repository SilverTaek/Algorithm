import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int ans1=0, ans2=0, ans3=0;
        
        for(int i =0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) ans1++;
            if(person2[i%person2.length] == answers[i]) ans2++;
            if(person3[i%person3.length] == answers[i]) ans3++;
        }
        
        int max = Math.max(Math.max(ans1,ans2), ans3);
        ArrayList<Integer> list = new ArrayList<>();
        if(max==ans1) list.add(1);
        if(max==ans2) list.add(2);
        if(max==ans3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}