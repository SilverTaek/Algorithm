import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1806 {

	static int N,S;
	static int arr[];
	static int sum = 0;
	static int ans = 0;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N+1];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		 
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		pro();
	
	}
    static void pro() {
        int R = 0, sum = 0, ans = N + 1;
        for (int L = 1; L <= N; L++) {
            // L - 1 을 구간에서 제외하기
            sum -= arr[L - 1];
            
            // R 을 옮길 수 있을 때 까지 옮기기
            while (R + 1 <= N && sum < S)
                sum += arr[++R];
            
            // [L ... R] 의 합, 즉 sum이 조건을 만족하면 정답 갱신하기
            if (sum >= S)
                ans = Math.min(ans, R - L + 1);
        }

        // ans 값을 보고 불가능 판단하기
        if (ans == N + 1)
            ans = 0;
        System.out.println(ans);
    }

}
