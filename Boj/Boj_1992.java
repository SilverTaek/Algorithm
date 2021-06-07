import java.util.Scanner;

public class Boj_1992 {

	static int map[][];
	static String ans;
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		ans = "";
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
				
			}
		}
		
		divide(0,0,N);
		System.out.println(ans);

	}

	public static void divide(int row, int col, int n) {
		if(isAble(row, col, n)) {
			ans+=map[row][col];
		}
		else {
			ans+="(";
			int newSize=n/2;
			divide(row, col, newSize);
			divide(row, col + newSize, newSize);
			divide(row+newSize, col, newSize);
			divide(row+newSize, col+newSize, newSize);
			ans+=")";
		}
		
	}

	public static boolean isAble(int row, int col, int n) {
		
		int value = map[row][col];
		for(int i=row; i<row+n; i++) {
			for(int j=col; j<col+n; j++) {
				if(map[i][j]!=value) return false;
			}
		}
		return true;
	}

}
