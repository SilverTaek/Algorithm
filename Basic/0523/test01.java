package mincoding;

import java.util.Scanner;

public class test01 {

	public static char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };

	// Base Index �Է� �ް�, ���� �ϳ� �Է� �ޱ�
	// Base Index �κ��� �Է� �޴� ������ Offset�� ������ ����ϱ�
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int baseIndex = sc.nextInt();
		String ch = sc.next();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch.charAt(0)) {

				int temp = i;

				ans = temp - baseIndex;
			}

		}

		System.out.println(ans);
	}

}
