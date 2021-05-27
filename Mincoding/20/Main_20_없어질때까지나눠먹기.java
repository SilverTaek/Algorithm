package mincoding;

import java.util.Scanner;

public class Main_20_없어질때까지나눠먹기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		bbq(n);
		System.out.print(n + " ");

	}

	private static void bbq(int n) {
		
		int temp = n/2;
		
		
		if(temp == 0) {
			return;
		}
		
		bbq(temp);
		
		System.out.print(temp + " ");
		
	}

}
