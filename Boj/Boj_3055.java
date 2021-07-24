import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_3055 {
	static int N,M;
	static boolean visit[][];
	static String arr[];
	static int water[][];
	static int animal[][];
	static int dir[][] = {{1,0}, {0,1}, {-1,0}, {0,-1}};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		water = new int[N][M];
		animal = new int[N][M];
		visit = new boolean[N][M];
		
		arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		pro();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i].charAt(j) == 'D') {
					if(animal[i][j] == -1) System.out.println("KAKTUS");
					else {
						System.out.println(animal[i][j]);
					}
				}
			}
		}
		
	}
	
	static void pro() {
		water_pro();
		animal_pro();
	}
	
	static void water_pro() {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				visit[i][j] = false;
				water[i][j] = -1;
				if(arr[i].charAt(j) == '*') {
					q.add(i);
					q.add(j);
					water[i][j] = 0;
					visit[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			
			for(int k=0; k<4; k++) {
				int nx = x + dir[k][0], ny = y + dir[k][1];
				if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if(arr[nx].charAt(ny) != '.') continue;
				if(visit[nx][ny]) continue;
				
				q.add(nx);
				q.add(ny);
				visit[nx][ny] = true;
				water[nx][ny] = water[x][y] + 1;
			}
		}
	}
	
	static void animal_pro() {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				visit[i][j] = false;
				animal[i][j] = -1;
				if(arr[i].charAt(j) == 'S') {
					q.add(i);
					q.add(j);
					animal[i][j] = 0;
					visit[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			
			for(int k=0; k<4; k++) {
				int nx = x + dir[k][0], ny = y + dir[k][1];
				if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if(arr[nx].charAt(ny) != '.' && arr[nx].charAt(ny) != 'D') continue;
				if(water[nx][ny] != -1 && water[nx][ny] <= animal[x][y] + 1) continue;
				if(visit[nx][ny]) continue;
				
				q.add(nx);
				q.add(ny);
				visit[nx][ny] = true;
				animal[nx][ny] = animal[x][y] + 1;
			}
		}
	}
}
