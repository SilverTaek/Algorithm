import java.util.*;
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        String maxJob = "";
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<table.length; i++) {
            String temp[] = table[i].split(" ");
            String name = "";
            int sum = 0;
            
            for(int j=0; j<temp.length; j++) {
                name = temp[0];
                int cal = temp.length-j;
                
                if(j == 0) continue;
                for(int k=0; k<languages.length; k++) {
                    if(languages[k].equals(temp[j])) {
                        sum += preference[k] * cal;
                    }
                }
            }
            
            if(sum >= max) {
                if(max == sum) {
                    if(maxJob.compareTo(name) < 0) {
                        continue;
                    }
                }
                
                max = sum;
                maxJob = name;
            }
        }
        
        
        return answer = maxJob;
    }
}