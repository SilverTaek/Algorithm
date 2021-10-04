package pro_23_5;

import java.util.Scanner;

public class p_암살자존휙 {
	static int map[][] = new int[3][4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[x][y] = 1;
		}
		
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if(map[i][j] == 1) {
					count++;
					if(count == 2) {
						System.out.println("위험");
						break;
					}
				}
			}
			if(i == 2 && count >= 0) {
				System.out.println("안전");
			}
			
			count = 0;
		}
		
	}

}
