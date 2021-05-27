package mincoding;

import java.util.Scanner;

public class Min_20_두칸씩점프하기 {

	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		bbq(n, 1);
		System.out.print(n);
	}

	private static void bbq(int n, int level) {
		
		n = n + 2;
		
		if(level == 3) {
			System.out.print(n + " ");
			return;
		}
		
		bbq(n, level + 1);
				
		System.out.print(n + " ");
	}

}
