package mincoding;

import java.util.Scanner;

public class Main_20_번지점프 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		bbq(n);

	}

	private static void bbq(int n) {
		
		System.out.print(n + " ");
		
		if(n == 0) {
			return;
		}
		
		bbq(n-1);
		
		System.out.print(n + " ");
	}

}
