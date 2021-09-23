package pro_22;

import java.util.Scanner;
// branch : 4
// level : 3
public class 몇번째행운 {
	static String str;
	static int cnt = 1;
	static char ans[] = new char[3];
	static char ch[] = {'A','B','C','D'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		rec_func(0);
		System.out.println(cnt);
	}
	
	public static void rec_func(int level) {
		String ss = null;
		if(level == 3) {
			for (int i = 0; i < 3; i++) {
				ss += ans[i];
			} cnt++;
			if(ss == str) {
				return;
			}
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			ans[level] = ch[i];
			rec_func(level+1);
			ans[level] = ' ';
		}
	}

}
