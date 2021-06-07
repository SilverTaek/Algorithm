import java.util.Scanner;

public class Boj_1780 {

	static int map[][];
	static int zero, posOne, negOne;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		map = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		divide(0,0,N);
		String ans = negOne + "\n" + zero + "\n" + posOne;
		System.out.println(ans);
		
	}
	
	private static void divide(int row, int col, int n) {
		
		if(isAble(row, col, n)) {
			if(map[row][col] == 0) zero++;
			else if(map[row][col] == 1) posOne++;
			else negOne++;
		}
		else {
			int newSize = n/3;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					divide(row+newSize*i, col + newSize*j, newSize);
				}
			}
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
