package mincoding;

import java.util.Scanner;

public class test04 {

	// 입력 받는 base index : y, x
	// 상 하 좌 우 값을 더해서 출력 하기

	static int arr[][] = {

			{ 1, 3, 7, 2 }, { 2, 2, 6, 1 }, { 1, 4, 5, 1 }, { 1, 1, 2, 1 }

	};

	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int ans = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = sc.nextInt();

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			ans += arr[ny][nx];
		}

		System.out.println(ans);

	}

}
