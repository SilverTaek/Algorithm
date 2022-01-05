import java.util.Arrays;
import java.util.Scanner;

// 1. 알파벳 숫자 만큼 배열 크기를 지정하여 생성한다.,
// 2. a부터 z까지 탐색하면서 입력 받은 문자를 탐색하여 몇번째 있는지 적고 해당 인덱스 배열에 값을 저장한다.
// 3. 배열을 출력한다.

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
