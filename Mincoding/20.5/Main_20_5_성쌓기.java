package mincoding;

import java.util.Scanner;

public class Main_20_5_성쌓기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 3; i < 7; i++) {
			
			for (int j = 0; j < i + 1 ; j++) {
				
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

}
