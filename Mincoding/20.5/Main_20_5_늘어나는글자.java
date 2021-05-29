package mincoding;

import java.util.Scanner;

public class Main_20_5_늘어나는글자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int temp = str.length();
		
		for (int i = 0; i < temp; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

	}

}
