package mincoding19;

public class Main_가장큰곳찾기 {
	
	static int map[][] = {
		
			{3,3,5,3,1},
			{2,2,4,2,6},
			{4,9,2,3,4},
			{1,1,1,1,1},
			{3,3,5,9,2}
	};
	
	static int max = -1;
	static int dy[] = {-1,-1,1,1};
	static int dx[] = {-1,1,1,-1};
	static int ansY = 0;
	static int ansX = 0;
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				for (int k = 0; k < 4; k++) {
					int ny = i + dy[k];
					int nx = j + dx[k];
					
					if(check(ny, nx)) {
						int temp = map[ny][nx];
					if(temp > max) {
						max = temp;
						ansY = i;
						ansX = j;
					}
					}
				}
				
			}
		}
		
		System.out.println(ansY + " " + ansX);
		
	}

	private static boolean check(int ny, int nx) {
		
		if(ny >=0 && nx >=0 && ny < 5 && nx < 5) {
			return true;
		}
		
		return false;
	}
	
	
	
}
