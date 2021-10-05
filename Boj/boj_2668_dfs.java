package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boj_2668_dfs {
	
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int num, count;
	static int visit[][];
	static char map[][];
	static List<Integer> list;
	
	public static void main(String[] args) {
		
		input();
		pro();
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
	}

	private static void pro() {
		list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(visit[i][j] == 0 && map[i][j] == '1') {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}
		
	}

	private static void dfs(int i, int j) {
		count++;
		visit[i][j] = 1;
		
		for (int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			
			if(nx < 0 || ny < 0 || nx >= num || ny >= num) continue;
			if(visit[nx][ny] == 1) continue;
			if(map[nx][ny] == '0') continue;
			dfs(nx, ny);
		}
		
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		map = new char[num][num];
		visit = new int[num][num];
		
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			for (int j = 0; j < num; j++) {
				map[i][j] = str.charAt(j);
			}
		}
	}

}
