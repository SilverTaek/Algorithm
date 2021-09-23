package pro_22;

import java.util.Scanner;

public class 경로이름은BGTK {
// level = 입력 / branch = 4;
	static int n;
	static char ch[] = {'B','G','T','K'};
	static char ans[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ans = new char[n];
		rec_func(0);
		

	}

private static void rec_func(int level) {
	if(level == n) {
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
		return;
	}
	
	for (int i = 0; i < 4; i++) {
		ans[level] = ch[i];
		rec_func(level +1);
		ans[level] = ' ';
	}
	
}

}
