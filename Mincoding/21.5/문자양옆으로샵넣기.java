package pro_21_5;

import java.util.Scanner;

public class ¹®ÀÚ¾ç¿·À¸·Î¼¥³Ö±â {
	static char ans[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String x = sc.next();
		String y = sc.next();
		
		ans = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == x.charAt(0) || str.charAt(i) == y.charAt(0)) {
				if(i==0) {
					ans[i+1] = '#';
					
				} else if(i==str.length()-1) {
					ans[i-1] = '#';
					
				} else {
					ans[i+1] = '#';
					ans[i-1] = '#';
				}
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(ans[i] == '#') {
				continue;
			}
			ans[i] = str.charAt(i);
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}

	}

}
