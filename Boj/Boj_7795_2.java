import java.util.Arrays;
import java.util.Scanner;

/*
2
5 3
8 1 7 3 1
3 6 1
3 4
2 13 7
103 11 290 215
 */
public class Boj_7795_2 {

	static int N,M;
	static int N_Arr[], M_Arr[];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int tc;
		tc = sc.nextInt();
		for (int tt = 1; tt <= tc; tt++) {
			input();
			pro();
		}
	}

	private static void input() {
		N = sc.nextInt();
		M = sc.nextInt();
		
		N_Arr = new int[N+1];
		M_Arr = new int[M+1];
		
		for (int i = 1; i <= N; i++) {
			N_Arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			M_Arr[i] = sc.nextInt();
		}
	}

	static int lower_bound(int[] A, int L, int R, int X) {
        // A[L...R] ���� X �̸��� �� �� ���� ������ �ε����� return �ϴ� �Լ�
        // �׷� �� ���ٸ� L - 1 �� return �Ѵ�

        int res = L - 1;  // ���� A[L...R] �� X ������ ���� ���ٸ� L - 1 �� return �Ѵ�.
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                res = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return res;
	}

static void pro() {
	 // B �迭�� ���� �̺�Ž���� �� �����̴ϱ�, ������ ������!
    Arrays.sort(M_Arr, 1, M + 1);
    
    int ans = 0;
    for (int i = 1; i <= N; i++) {
        // A[i] �� �������� ��, B ������ A[i]���� ���� �� �� ���� �ִ� �� count�ϱ�
        ans += lower_bound(M_Arr, 1, M, N_Arr[i]);
    }
    System.out.println(ans);
}

}