package pro_21_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로줄의합과해당인덱스값구하기 {
	
	static int arr[][] = {
			{3,4,1,5},{3,4,1,3},{5,2,3,6}
	};
	static int ans[] = new int[4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int aa = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
			 ans[i] += arr[j][i];
			}
			
		}
		
		System.out.println(ans[aa]);
	}

}
