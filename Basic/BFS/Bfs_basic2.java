import java.util.*;

public class Bfs_basic2 {
	
	static int N, Max_M = 10;
	static int map[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[Max_M][Max_M];
		for (int i=0; i < N; i++) {
			for (int j=0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int sRow, sCol, dRow, dCol;
		sRow = sc.nextInt();
		sCol = sc.nextInt();
		dRow = sc.nextInt();
		dCol = sc.nextInt();
		
		System.out.println(bfs(sRow, sCol, dRow, dCol));
		
	}
	
	public static int bfs(int sRow, int sCol, int dRow, int dCol) {
		boolean visited[][] = new boolean[Max_M][Max_M];
		Queue<Node> q = new LinkedList<>();
		visited[sRow][sCol] = true;
		q.add(new Node(sRow, sCol, 0));
		
		while(!q.isEmpty()) {
			Node curr = q.remove();
			
			if(curr.x == dRow && curr.y == dCol) {
				return curr.dist;
			}
			
			for (int k=0; k<4; k++) {
				int nx = curr.x + dx[k];
				int ny = curr.y + dy[k];
				
				if(nx < 0 || ny < 0 || nx >= N || ny >=N) continue;
				if(visited[nx][ny]) continue;
				if(map[nx][ny] == 1) continue;
				
				visited[nx][ny] = true;
				q.add(new Node(nx,ny,curr.dist + 1));
			}
		}
		
		return -1;
	}
	
	static class Node {
		int x;
		int y;
		int dist;
		Node(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
}
