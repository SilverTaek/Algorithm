package pro_24;

import java.util.Scanner;

public class p_NASAÀÇ¿¬±¸ {
	//65 ~ 90
	static int ans[] = new int[91];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			ans[str.charAt(i)]++;
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 91; i++) {
			if(ans[i] == 0) continue;
			if(ans[i] > max) max = ans[i];
			if(ans[i] < min) min = ans[i];
		}
		
		
		for (int i = 0; i < 91; i++) {
			if(ans[i] == max) System.out.println((char)i);
			
		}
		
		for (int j = 0; j < 91;) {
			if(ans[j] == min) System.out.println((char)j);
			break;
		}

	}

}
