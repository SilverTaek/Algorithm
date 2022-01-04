import java.util.Scanner;

// 9줄에 걸쳐 숫자 입력
// 출력은 최댓값 / 해당 최댓값이 몇번 째인지 출력
/*
3
29
38
12
57
74
40
85
61
*/
public class boj_2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = -1;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		for (int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);

	}

}
