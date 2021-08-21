import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_1260 {
	
	static int N, M, V;
	static ArrayList<Integer>[] adj;
	static boolean[] visit;
	
	public static void main(String[] args) {
		input();
		pro();

	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		adj = new ArrayList[N + 1];
		 for (int i = 1;i <= N; i++)
	            adj[i] = new ArrayList<>();
	        for (int i = 0; i < M; i++) {
	            int x = sc.nextInt(), y = sc.nextInt();
	            adj[x].add(y);
	            adj[y].add(x);
	        }
	        for (int i = 1;i<=N;i++)
	            Collections.sort(adj[i]);
		
		
	}
	
	   static void dfs(int x) {
	        // x 를 방문했다.
	        visit[x] = true;
	        System.out.print(x + " ");

	        // x 에서 갈 수 있는 곳들을 작은 번호부터 모두 방문한다.
	        for (int y: adj[x]){

	            // y 를 이미 갈 수 있다는 사실을 안다면, 굳이 갈 필요 없다.
	            if (visit[y])
	                continue;

	            // y에서 갈 수 있는 곳들도 확인 해보자
	            dfs(y);
	        }
	    }
	
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();

        // start는 방문 가능한 점이므로 que에 넣어준다.
        que.add(start);
        visit[start] = true;  // start를 갈 수 있다고 표시하기 (중요!!!)

        while (!que.isEmpty()) {  // 더 확인할 점이 없다면 정지
            int x = que.poll();

            System.out.print(x + " ");
            for (int y: adj[x]){
                if (visit[y]) continue;  // x 에서 y 를 갈 수는 있지만, 이미 탐색한 점이면 무시

                // y를 갈 수 있으니까 que에 추가하고, visit 처리 하기!
                que.add(y);
                visit[y] = true;
            }
        }
    }

    static void pro() {
        visit = new boolean[N + 1];
        dfs(V);
        System.out.println();
        for (int i = 1; i <= N; i++) visit[i] = false;
        bfs(V);
        
    }


}
