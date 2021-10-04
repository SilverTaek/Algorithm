package pro_24;

import java.util.Scanner;

public class p_√£æ∆∂ÛπŒ√∂¿Ã¿«»Á¿˚ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			String temp = sc.next();
			if(temp.indexOf(str) != -1) {
				System.out.println("O");
			}else {
				System.out.println("X");
			}

	}

}
}
