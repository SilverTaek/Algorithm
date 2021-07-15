import java.util.*;

class Solution {
    static int[] visited;
    static int nodecount = 0;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new int[n];
        Arrays.fill(visited,0);
        for(int i=0; i<n; i++){
            if(visited[i] == 0){
                nodecount++;
                visited[i] = nodecount;
                bfs(i, computers);
            }
        }
        answer = nodecount;
        
        return answer;
    }
    private static void bfs(int r, int[][] computers) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(r);
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i=0; i<computers[cur].length; i++){
                if(computers[cur][i] == 1 && visited[i] == 0){
                    visited[i] = nodecount;
                    queue.add(i);
                }
            }
        }
    }
}