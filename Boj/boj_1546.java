import java.util.Scanner;
// 1. 최댓값을 찾는다.
// 2. 입력 된 배열에 공식을 대입하여 값을 변경한다.
// 3. 해당 값들의 평균을 구하여 출력한다.

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
