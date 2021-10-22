import java.util.*;

class Solution {
    static int[] position;
    static boolean[] visited;
    static int cnt;
    static HashMap<Character, Integer> kakao;
    static boolean ok;
    public int solution(int n, String[] data) {
        int answer = 0;
        position = new int[8];
        visited = new boolean[8];
        cnt = 0;
        kakao = new HashMap<>();
        ok = true;
        kakao.put('A',0);
        kakao.put('C',1);
        kakao.put('F',2);
        kakao.put('J',3);
        kakao.put('M',4);
        kakao.put('N',5);
        kakao.put('R',6);
        kakao.put('T',7);
        
        perm(0, data);
        
        return cnt;
    }
    
    static void perm(int level, String[] data) {
        if(level == 8) {
            if(isOk(data)){
                cnt++;
            }
            return;
        }
        
        for(int branch = 0; branch < 8; branch ++) {
            if(!visited[branch]){
                visited[branch] = true;
                position[level] = branch;
                perm(level + 1, data);
                visited[branch] = false;
            }
        }
    }
    
    public static boolean isOk(String[] data) {
        for(int i=0; i<data.length; i++) {
            int X = kakao.get(data[i].charAt(0));
            int Y = kakao.get(data[i].charAt(2));
            char type = data[i].charAt(3);
            int diff = data[i].charAt(4) - '0';
            int Xpos = position[X];
            int Ypos = position[Y];
            
            if(type == '=') {
                if(Math.abs(Xpos - Ypos) - 1 != diff){
                    return false;
                }
            }
                else if(type == '>') {
                    if(Math.abs(Xpos - Ypos) -1 <= diff) {
                        return false;
                    }
                }
                else if(type == '<') {
                    if(Math.abs(Xpos - Ypos) -1 >= diff){
                        return false;
                    }
                }
            }
            return true;
    }
}