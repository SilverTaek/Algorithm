import java.util.Arrays;
import java.util.Scanner;

// 1. ���ĺ� ���� ��ŭ �迭 ũ�⸦ �����Ͽ� �����Ѵ�.,
// 2. a���� z���� Ž���ϸ鼭 �Է� ���� ���ڸ� Ž���Ͽ� ���° �ִ��� ���� �ش� �ε��� �迭�� ���� �����Ѵ�.
// 3. �迭�� ����Ѵ�.

public class boj_10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char ch[] = str.toCharArray();
		int temp[] = new int[ch.length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = ch[i];
		}

		int arr[] = new int[123];

		Arrays.fill(arr, -1);
		for (int i = 97; i < 123; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (i == temp[j]) {
					arr[i] = j;
					break;
				}
			}

		}

		for (int i = 97; i < 123; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
