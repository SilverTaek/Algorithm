import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

/*
4 5 1
1 2
1 3
1 4
2 4
3 4
 */
public class boj1260 {
	static int N, M, V;
	static int map[][];
	static boolean visit[];
	public static void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for (int i = 1; i <= M; i++) {
			
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st1.nextToken());
			int y = Integer.parseInt(st1.nextToken());
			
			map[x][y] = 1;
			map[y][x] = 1;
		}
	}
	
	public static void dfs(int start) {
		visit[start] = true;
		System.out.print(start + " ");
		for (int y = 1; y <= N; y++) {
			if(map[start][y] == 0) continue;
			if(visit[y] == true) continue;
			dfs(y);
		}
		
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			
			System.out.print(x+" ");
			
			for (int y = 1; y <= N; y++) {
				if(map[x][y] == 0) continue;
				if(visit[y] == true) continue;
				
				q.add(y);
				visit[y] = true;
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		input();
		
		dfs(V);
		for (int i = 1; i < N+1; i++) {
			visit[i] = false;
			
		}
		System.out.println();
		bfs(V);
	
	}

}
