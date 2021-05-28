package mincoding;

import java.util.Scanner;

public class Main_20_5_절반나누기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int temp = str.length() / 2;
		
		if(temp % 2 ==0) {
			System.out.println("다른문장");
		} else {
			for (int i = 0; i < temp; i++) {
				if(str.charAt(i) != str.charAt(temp + i)) {
					System.out.println("다른문장");
					break;
				} else {
					System.out.println("동일한문장");
					break;
				}
			}
		}
		
		
		
	}

}
