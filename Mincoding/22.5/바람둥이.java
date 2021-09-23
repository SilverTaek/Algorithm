package pro_22_5;

import java.util.Scanner;

public class ¹Ù¶÷µÕÀÌ {
// branch = n / level = 2
	static char ch[] = {'o','x'};
	static char ans[] = new char[2];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		rec_func(0);
	}
	private static void rec_func(int level) {
		if(level == 2) {
			for (int i = 0; i < 2; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < n; i++) {
			ans[level] = ch[i];
			rec_func(level+1);
			ans[level] = ' ';
		}
		
	}

}
