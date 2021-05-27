package mincoding;

import java.util.Scanner;

public class Main_20_다섯글자순차역순 {

	static char arr[] = new char[5];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < 5; i++) {
			arr[i] = str.charAt(i);
		}
		
		bbq(0);
		
	}

	private static void bbq(int level) {
		
		System.out.print(arr[level]);
		
		if(level == 4) {
			System.out.println();
			System.out.print(arr[level]);
			return;
		}
		
		bbq(level + 1);
		
		System.out.print(arr[level]);
		
	}

}
