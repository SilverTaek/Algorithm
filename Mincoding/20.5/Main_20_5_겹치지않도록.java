package mincoding;

import java.util.Scanner;

public class Main_20_5_겹치지않도록 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int map1[][] = new int[4][4];
		int map2[][] = new int[4][4];
		
		int cnt = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				map1[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				map2[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(map1[i][j] == map2[i][j]) {
					cnt ++;
				}
			}
		}
		
		if(cnt > 0) {
			System.out.println("걸리다");
		} else {
			System.out.println("걸리지않는다.");
		}
	}

}
