package mincoding;

import java.util.Scanner;

public class Main_재귀부메랑 {

	static int arr[] = {3,7,4,1,9,4,6,2};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int index = sc.nextInt();
		
		bbq(index);
		
	}

	private static void bbq(int index) {
		
		System.out.print(arr[index] + " ");
		
		if(index == 0) {
			return;
		}
		
		bbq(index - 1);
		
		System.out.print(arr[index] + " ");
	}

}
