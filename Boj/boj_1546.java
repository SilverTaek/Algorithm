import java.util.Scanner;
// 1. �ִ��� ã�´�.
// 2. �Է� �� �迭�� ������ �����Ͽ� ���� �����Ѵ�.
// 3. �ش� ������ ����� ���Ͽ� ����Ѵ�.

public class boj_1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double result = 0;
		double max = -1;
		double sum = 0;

		double arr[] = new double[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}

		result = sum / n;

		System.out.println(result);
	}

}
