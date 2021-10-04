package pro_24;

import java.util.Scanner;

public class p_크리스마스카드만들기 {
	static String str[];
	static int num;
	static String ans;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		
		rec_func(0);
		System.out.println(count);

	}
	private static void rec_func(int level) {
		
		if(level == 3) {
			if(ans == "CHRISTMAS") count++;
			return;
		}
		
		for (int branch = 0; branch < num; branch++) {
			ans += str[branch];
			rec_func(level +1);
			ans = "";
		}
		
	}

}
