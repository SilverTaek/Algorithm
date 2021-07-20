import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_14502 {
	static int N,M,B,ans;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int [][] arr, blank;
	static boolean[][] visit;
	
	public static void main(String args[]) throws IOException {
		input();
		pro();
		
	}
	
	private static void pro() {
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				if(arr[i][j] == 0) {
					B++;
					blank[B][0] = i;
					blank[B][1] = j;
				}
			}
		}
		
		dfs(1,0);
		System.out.println(ans);
		
	}

	private static void dfs(int idx, int selected_cnt) {
		if(selected_cnt == 3) {
			bfs();
			return;
		}
		if(idx > B) return;
		
		arr[blank[idx][0]][blank[idx][1]] = 1;
		dfs(idx + 1, selected_cnt + 1);
		
		arr[blank[idx][0]][blank[idx][1]] = 0;
		dfs(idx + 1, selected_cnt);
	}

	private static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i <= N; i++) {
			for(int j=1; j <= M; j++) {
				visit[i][j] = false;
				if(arr[i][j] == 2) {
					q.add(i);
					q.add(j);
					visit[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			int x = q.poll(), y = q.poll();
			for(int k=0; k<4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				
				if(nx < 1 || ny < 1 || nx > N || ny > M) continue;
				if(arr[nx][ny] !=0) continue;
				if(visit[nx][ny]) continue;
				visit[nx][ny] = true;
				q.add(nx);
				q.add(ny);
			}
		}
		
		int cnt = 0;
        for (int i = 1; i <= N; i++) for (int j = 1; j <= M; j++) if (arr[i][j] == 0 && !visit[i][j]) cnt++;
        ans = Math.max(ans, cnt);
		
	}

	private static void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][M+1];
		visit = new boolean[N+1][M+1];
		blank = new int[N * M + 1][2];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}
}
