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
        // A[L...R] 에서 X 미만의 수 중 제일 오른쪽 인덱스를 return 하는 함수
        // 그런 게 없다면 L - 1 을 return 한다

        int res = L - 1;  // 만약 A[L...R] 중 X 이하의 수가 없다면 L - 1 을 return 한다.
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
	 // B 배열에 대해 이분탐색을 할 예정이니까, 정렬을 해주자!
    Arrays.sort(M_Arr, 1, M + 1);
    
    int ans = 0;
    for (int i = 1; i <= N; i++) {
        // A[i] 를 선택했을 때, B 에서는 A[i]보다 작은 게 몇 개나 있는 지 count하기
        ans += lower_bound(M_Arr, 1, M, N_Arr[i]);
    }
    System.out.println(ans);
}

}