package mincoding;

import java.util.Scanner;

public class Main_20_마이클잭슨 {

	static int arr[] = new int[6];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		
		bbq(0);

	}

	private static void bbq(int level) {
		
		System.out.print(arr[level] + " ");
		
		if(level == 5) {
			return;
		}
		
		bbq(level + 1);
		
		System.out.print(arr[level] + " ");
	}

}
