package mincoding;

import java.util.Scanner;

public class test03 {

	// �Է� �޴� base index : y, x
	// �� �� �� �� ���� ���ؼ� ��� �ϱ�

	static int arr[][] = {

			{ 1, 3, 7, 2 }, { 2, 2, 6, 1 }, { 1, 4, 5, 1 }, { 1, 1, 2, 1 }

	};

	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static int ansY, ansX;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int x = sc.nextInt();

		int ans = 0;

		// ��
		ansY = y + dx[0];
		ansX = x + dy[0];

		ans = ans + arr[ansY][ansX];

		// ��
		ansY = y + dx[1];
		ansX = x + dy[1];

		ans = ans + arr[ansY][ansX];

		// ��
		ansY = y + dx[2];
		ansX = x + dy[2];

		ans = ans + arr[ansY][ansX];

		// ��
		ansY = y + dx[3];
		ansX = x + dy[3];

		ans = ans + arr[ansY][ansX];

		System.out.println(ans);

		for (int i = 0; i < 4; i++) {

			int ny = dx[i];
			int nx = dy[i];

		}

	}

}
