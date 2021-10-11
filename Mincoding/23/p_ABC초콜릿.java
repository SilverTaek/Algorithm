package pro_23;

import java.util.Scanner;

// branch : 3 A,B,C
// Level : n
public class p_ABCÃÊÄÝ¸´ {
	static int n;
	static char ch[] = {'A','B','C'};
	static char ans[];
	static int count = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ans = new char[n];
		dfs(0);
		System.out.println(count);

	}

	private static void dfs(int level) {
		
		if(level == n) {
			count++;
			return;
		}
		
		for (int branch = 0; branch < 3; branch++) {
			if(level == 2 && ch[branch] == ans[level-1] && ans[level-1] == ans[level-2]) continue;
			ans[level] = ch[branch];
			dfs(level + 1);
			ans[level] = ' ';
		}
		
		
	}

}
