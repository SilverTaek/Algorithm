package mincoding;

import java.util.Scanner;

public class test04 {

	// �Է� �޴� base index : y, x
	// �� �� �� �� ���� ���ؼ� ��� �ϱ�

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
