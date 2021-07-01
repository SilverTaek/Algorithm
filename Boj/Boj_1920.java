import java.util.*;

public class Boj_1920 {
	static int N;
	static int[] A;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		N = sc.nextInt();

		A = new int[N+1];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		pro();

	}

	private static void pro() {
		int M = sc.nextInt();
		Arrays.sort(A, 0, N);
		for (int i = 0; i < M; i++) {
			int X = sc.nextInt();
			if (bin_search(A, 0, N, X)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	private static boolean bin_search(int[] A, int L, int R, int X) {
		while (L <= R) {
			int mid = (L + R) / 2;
			if (A[mid] == X) {
				return true;
			}
			if (A[mid] < X) {
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return false;
	}
}
