package pro_21_5;

import java.util.Scanner;

// 1,1
// 2,3
public class 너에게가려면 {
	static char map[][] = new char[4][3];
	static int x,y,xx,yy;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			String str = sc.next();
			for (int j = 0; j < 3; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if(map[i][j] == 'A') {
					x = i;
					y = j;
				} else if(map[i][j] == 'B') {
					xx = i;
					yy = j;
				}
			}
		}
		
		int ans_x = Math.abs(x - xx);
		int ans_y = Math.abs(y - yy);
		
		System.out.println(ans_x+ans_y);
	}
}
