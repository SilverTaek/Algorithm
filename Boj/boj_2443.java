import java.util.Scanner;

public class boj_2443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		int blank = -1;

		for (int i = 0; i < n; i++) {

			blank++;
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * n - 1 - count; j++) {

				System.out.print("*");
			}

			count += 2;

			System.out.println();
		}

	}

}
