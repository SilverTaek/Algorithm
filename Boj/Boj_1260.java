import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_1260 {

	static int arr[][];
	static int visited[];
	static int N,M,V;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		arr = new int[N+1][N+1];
		visited = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(V);
		Arrays.fill(visited, 0);
		System.out.println("");
		bfs(V);

	}

	public static void bfs(int x) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		visited[x] = 1;
		while(!q.isEmpty()) {
			
			x = q.poll();
			System.out.print(x+" ");
			for(int i=0; i<N+1; i++) {
				if(visited[i]!=1 && arr[x][i]==1) {
					q.offer(i);
					visited[i] = 1;
					
				}
			}
			
		}
	}

	public static void dfs(int x) {
		if(visited[x]==1) return;
		
		visited[x] = 1;
		System.out.print(x+" ");
		for(int i=0; i<N+1; i++) {
			if(arr[x][i]==1) {
				dfs(i);
			}
		}
	}

}
