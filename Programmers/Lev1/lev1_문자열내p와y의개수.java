package solution;


import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
    List<Character> listp = new ArrayList<>();
    List<Character> listy = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='p' || s.charAt(i)=='P') {
				listp.add(s.charAt(i));
			}else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
				listy.add(s.charAt(i));
			}
			
		}
        
        if(listp.size()==listy.size()) {
        	answer = true;
        }else if(listp.size() != listy.size()) {
        	answer = false;
        }else {
        	answer = true;
        }
      

        return answer;
    }
}