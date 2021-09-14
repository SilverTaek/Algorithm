package pro_21;

import java.util.Scanner;

//level, branch 입력받고 그만큼 재귀호출
public class Level과Branch {
	
	static int level, branch;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		level = sc.nextInt();
		branch = sc.nextInt();
		
		rec_func(0);

	}
	
	public static void rec_func(int m) {
		
		if(m == level) return;
		
		for(int i=0; i<branch; i++) {
			rec_func(m + 1);
		}
	}

}
