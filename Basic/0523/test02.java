package mincoding;

import java.util.Scanner;

public class test02 {

	public static int[][] arr = { { 3, 4, 4, 7 }, { 1, 5, 6, 7 }, { 3, 6, 6, 9 }, { 2, 7, 9, 0 }, { 5, 3, 3, 1 },
			{ 1, 6, 8, 4 } };

	// �Է� �޴� base index : y, z
	// �Է� �޴� offset : dy, dx
	// base index���� offset �Ÿ��� ���� ���

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int z = sc.nextInt();

		int dy = sc.nextInt();
		int dz = sc.nextInt();

		int ansY = dy + y;
		int ansZ = dz + z;

		if (ansY <= 3 && ansZ <= 5) {

			System.out.println(arr[ansY][ansZ]);

		} else {
			System.out.println("�ش� ���� �迭�� �ʰ��Ͽ����ϴ�.");
		}
	}

}
