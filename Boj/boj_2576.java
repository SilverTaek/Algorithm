import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class boj_2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[7];

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 7; i++) {
			if (arr[i] % 2 != 0) {
				list.add(arr[i]);
			}
		}

		int sum = 0;

		for (int value : list) {
			sum += value;
		}
		Collections.sort(list);

		if (list.size() > 0) {

			System.out.println(sum);
			System.out.println(list.get(0));

		} else {
			System.out.println(-1);
		}
	}

}
