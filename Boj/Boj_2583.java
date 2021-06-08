import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_2583 {

	static int N, M, K, kind;
	static int map[][];
	static int visited[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		map = new int[N][M];
		
		for (int i = 0; i < K; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for (int j = y1; j < y2; j++) {
				for (int j2 = x1; j2 < x2; j2++) {
					map[j][j2] = 1;
				}
			}
			
			
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 1) {
					list.add(BFS(i,j));
					kind++;
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(kind);
		for(int a : list) {
			System.out.print(a + " ");
		}
		System.out.println();

	}
	
	private static Integer BFS(int i, int j) {
		
		Queue<Node> q = new LinkedList<>();
		int cnt = 0;
		q.offer(new Node(i,j));
		map[i][j] = 1;
		
		while(!q.isEmpty()) {
			Node n = q.poll();
			int x = n.x;
			int y = n.y;
			
			for (int k = 0; k < 4; k++) {
				
				int ndx = x + dx[k];
				int ndy = y + dy[k];
				
				if(check(ndx, ndy) && map[ndx][ndy] != 1) {
					q.offer(new Node(ndx, ndy));
					map[ndx][ndy] = 1;
					cnt++;
				}
			}
		}
		
		return cnt+1;
	}

	private static boolean check(int x, int y) {
		if(x <0 || x >= N || y < 0 || y >= M) return false;
		
		return true;
	}

	static class Node {
		int x;
		int y;
		
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
