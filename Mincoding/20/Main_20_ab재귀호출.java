package mincoding;

import java.util.Scanner;

public class Main_20_ab재귀호출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		bbq(a,b);
	}

	private static void bbq(int a, int b) {
		System.out.print(a + " ");
		
		if(a == b) {
			return;
		}
		
		bbq(a + 1, b);
		
		System.out.print(a + " ");
		
	}

}
