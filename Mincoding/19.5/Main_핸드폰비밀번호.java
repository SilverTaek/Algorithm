package mincoding19_5;

import java.util.Scanner;

public class Main_핸드폰비밀번호 {

	static int map[][] = {
			
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	static int map2[][] = {
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}
	};
	
	static int arr[] = new int[4];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(map[i][j] == arr[0]) {
					map2[i][j] = 1;
				} else if(map[i][j] == arr[1]) {
					map2[i][j] = 2;
				} else if(map[i][j] == arr[2]) {
					map2[i][j] = 3;
				} else if(map[i][j] == arr[3]) {
					map2[i][j] = 4;
				}
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(map2[i][j]);
			}
			System.out.println();
		}
	}

}
