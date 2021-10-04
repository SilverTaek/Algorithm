package pro_23_5;

import java.util.Scanner;

public class p_왼쪽오른쪽이동 {
	static int map[] = {3,5,1,9,7};
	static char ch[] = new char[4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			String str = sc.next();
			ch[i] = str.charAt(0);
			if(ch[i] == 'R') {
				Right();
			} else {
				Left();
			}
		}
		for (int i = 0; i < map.length; i++) {
			System.out.print(map[i] + " ");
			
		}
		

	}

	private static void Left() {
		int temp = map[0];
		for (int i = 0; i < 4; i++) {
			map[i] = map[i+1];
		}
		map[4] = temp;
		
	}

	private static void Right() {
		int temp = map[4];
		for (int i = 4; i >= 1; i--) {
			map[i] = map[i-1];
		}
		map[0] = temp;
	}
	
	

}
