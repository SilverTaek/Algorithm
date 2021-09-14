package pro_21;

import java.util.Scanner;

public class 로그인처리하기 {

	static String id, pwd;
	static boolean bl = true;
	static String aid = "qlqlaqkq";
	static String apwd = "tkaruqtkf";

	public static void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.next();
		pwd = sc.next();
	}

	public static void pro() {
		for (int i = 0; i < id.length(); i++) {
			if (aid.charAt(i) != id.charAt(i)) {
				bl = false;
			}
		}

		for (int i = 0; i < id.length(); i++) {
			if (apwd.charAt(i) != pwd.charAt(i)) {
				bl = false;
			}
		}
		String ans = (bl == true) ? "LOGIN" : "INVALID";
		System.out.println(ans);
	}

	public static void main(String args[]) {
		input();
		pro();
	}

}