package pro_22;

import java.util.Scanner;
// level == 4; / branch = 4
public class 청소당번 {
	static int n;
	static int ans[] = new int[4];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		rec_func(0);
		
	}
	
	public static void rec_func(int level) {
		
		if(level == 4) {
			for (int i = 0; i < 4; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			ans[level] = i;
			rec_func(level+1);
			ans[level] = 0;
		}
	}

}
