package pro_23_5;

import java.util.Scanner;

public class p_네모네모더하기 {
	static int map[][] = new int[4][4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += map[i][j];
			}
			map[i][3] = sum;
			sum = 0;
		}
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				sum += map[i][j];
			}
			map[3][j] = sum;
			sum = 0;
		}
		
		map[3][3] = map[0][0] + map[1][1] + map[2][2];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
