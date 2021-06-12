import java.util.*;

public class Bfs_basic {
	
	static int Max_N = 10;
	static int N, E;
	static int [][] Graph = new int[Max_N][Max_N];
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		for(int i=0; i<E; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Graph[x][y] = Graph[y][x] = 1;
		}
		
		BFS(0);
		
	}
	
	public static void BFS(int Node) {
		
		boolean[] visited = new boolean[Max_N];
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(Node);
		
		visited[Node] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			
			for(int next = 0; next < N; next++) {
				if(!visited[next] && Graph[curr][next] == 1) {
					visited[next] = true;
					q.add(next);
				}
			}
		}
	}
}
