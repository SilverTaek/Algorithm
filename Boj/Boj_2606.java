import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_2606 {

	static int N,M,cnt;
	static int arr[][];
	static int visited[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N+1][N+1];
		visited = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr[x][y] = 1;
			arr[y][x] = 1;
			
		}
		
		BFS(1);
		System.out.println(cnt);

	}

	private static void BFS(int i) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		visited[i] = 1;
		
		while(!q.isEmpty()) {
			i = q.poll();
			
			for(int j=0; j<N+1; j++) {
				if(visited[j]!=1 && arr[i][j]==1) {
					q.offer(j);
					visited[j] = 1;
					cnt++;
				}
			}
		}
		
	}

}
