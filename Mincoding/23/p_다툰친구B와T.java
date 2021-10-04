package pro_23;

import java.util.Scanner;

public class p_´ÙÅ÷Ä£±¸B¿ÍT {
	static char charArr[];
	static char ans[];
	static String str;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		charArr = str.toCharArray();
		ans = new char[str.length()];
		
		rec_func(0);
		System.out.println(count);
	}
	private static void rec_func(int level) {
		
		if(level == 4) {
			for (int i = 0; i < 4; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			count++;
			return;
		}
		
		for (int branch = 0; branch < 4; branch++) {
			if(level > 0 && ans[level-1] == 'B'  && charArr[branch] == 'T') continue;
			if(level > 0 && ans[level-1] == 'T'  && charArr[branch] == 'B') continue;
			ans[level] = charArr[branch];
			rec_func(level + 1);
			ans[level] = ' ';
		}
		
	}

}
