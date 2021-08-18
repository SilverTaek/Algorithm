import java.util.Arrays;
import java.util.Scanner;

public class Boj_11652 {
	
	static int N;
	static long[]a; 
	
	 static void input() {
	        Scanner sc = new Scanner(System.in);
		 	N = sc.nextInt();
	        a = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	            a[i] = sc.nextLong();
	        }
	    }

	    static void pro() {
	        Arrays.sort(a, 1, N + 1);  // Sort
	        long mode = a[1];
	        int modeCnt = 1, curCnt = 1;  // mode: 최빈값, modeCnt: 최빈값의 등장 횟수, curCnt: 현재 값(a[1])의 등장 횟수

	        for (int i = 2; i <= N; i++) {
	            if (a[i] == a[i - 1]) {  // a[i] 라는 숫자가 계속 등장하고 있다.
	                curCnt++;
	            } else {
	                curCnt = 1;  // a[i] 라는 숫자가 새롭게 등장했다.
	            }

	            if (curCnt > modeCnt) {
	                modeCnt = curCnt;
	                mode = a[i];
	            }
	        }
	        System.out.println(mode);
	    }

	    public static void main(String[] args) {
	        input();
	        pro();
	    }

}
