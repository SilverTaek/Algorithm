class p_네트워크 {
    static int visit[];
    static int answer = 0;
    static int n = 3;
    static int computers[][] = {
    		{1,1,0},
    		{1,1,0},
    		{0,0,1}
    };
    
    public static void main(String[] args) {
		System.out.println(solution(n, computers));
	
	}
    public static void dfs(int x, int n, int[][] computers){
        visit[x] = 1;
        for(int y=0; y<computers.length; y++){
            if(computers[x][y] == 0) continue;
            if(visit[y] == 1) continue; // 자기 자신을 제외
            dfs(y, n, computers);
        }
    }
    
    public static int solution(int n, int[][] computers) {
        
        visit = new int[n];
        for (int i = 0; i < computers.length; i++) {
			if(visit[i] == 0) {
				answer++;
				dfs(i, n, computers);				
			}
		}
      
        return answer;
    }
}