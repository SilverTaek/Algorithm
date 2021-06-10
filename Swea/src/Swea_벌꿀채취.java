import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_벌꿀채취 {

	static int N,M,C;
	static int [][] map, maxMap;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(in.readLine());
		StringTokenizer st = null;
		
		for (int t = 1; t <= TC; t++) {
			st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			maxMap = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			System.out.println("#" + t + " " + getMaxBenefit());
		}
	}

	private static int getMaxBenefit() {
		
		makeMaxMap();
		return processCombination();
	}
	private static void makeMaxMap() {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {
				makeMaxSubSet(i,j,0,0,0);
			}
		}
		
	}

	private static void makeMaxSubSet(int i, int j, int cnt, int sum, int powSum) {
		
		if(sum > C) return;
		if(cnt == M) {
			if(maxMap[i][j-M] < powSum) maxMap[i][j-M] = powSum;
			return;
		}
		
		// 선택
		makeMaxSubSet(i, j+1, cnt+1, sum + map[i][j], powSum + map[i][j] * map[i][j]);
		// 비선택
		makeMaxSubSet(i,j+1, cnt+1, sum, powSum);
		
	}

	private static int processCombination() {
		
		int max = 0, aBenefit = 0, bBenefit = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) { //일꾼 A선택
				aBenefit = maxMap[i][j];
				// 일꾼 B 선택
				// 같은 행
				bBenefit = 0;
				
				for (int j2 = j + M; j2 <= N-M; j2++) {
					if(bBenefit < maxMap[i][j2]) bBenefit = maxMap[i][j2];
				}
				// 다른 행
				for (int i2 = i+1; i2 < N; i2++) {
					for (int j2 = 0; j2 <= N-M; j2++) {
						if(bBenefit < maxMap[i2][j2]) bBenefit = maxMap[i2][j2];
						
					}
				}
				if(max < aBenefit + bBenefit) max = aBenefit+bBenefit;
			}
		}
		return max;
	}

}
