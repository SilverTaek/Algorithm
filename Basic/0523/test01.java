package mincoding;

import java.util.Scanner;

public class test01 {

	public static char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };

	// Base Index 입력 받고, 문자 하나 입력 받기
	// Base Index 로부터 입력 받는 문자의 Offset이 몇인지 출력하기
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int baseIndex = sc.nextInt();
		String ch = sc.next();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch.charAt(0)) {

				int temp = i;

				ans = temp - baseIndex;
			}

		}

		System.out.println(ans);
	}

}
