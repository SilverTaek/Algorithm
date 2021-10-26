import java.util.LinkedList;
import java.util.Queue;

public class p_거리두기 {
	static String places[][] = {
			{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
			{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
			{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
			{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
			{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
			};
	
	static int ans[];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	static public class Node {
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String args[]) {
		
		solution(places);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	static public int[] solution(String[][] places) {
		
		ans = new int[places.length];
		
		for (int i = 0; i < places.length; i++) {
			ans[i] = isCorrect(places[i]);
		}
		return ans;
	}

	private static int isCorrect(String[] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i].charAt(j) == 'P') {
					if(!bfs(board, i, j)) {
						return 0;
					}
				}
			}
		}
		return 1;
	}

	private static boolean bfs(String[] board, int x, int y) {
		Queue<Node> q = new LinkedList<>();
		boolean[][] visited = new boolean[board.length][board.length];
		q.offer(new Node(x,y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for (int k = 0; k < 4; k++) {
				int nx = node.x + dx[k];
				int ny = node.y + dy[k];
				int diff = Math.abs(x - nx) + Math.abs(y - ny);
				
				if(nx < 0 || ny < 0 || nx >= board.length || ny >= board.length) continue;
				if(visited[nx][ny] || diff > 2) continue;
				
				visited[nx][ny] = true;
				if(board[nx].charAt(ny) == 'X') continue;
				else if(board[nx].charAt(ny) == 'P') return false;
				else q.offer(new Node(nx, ny));
			}
		}
		return true;
	}
}
