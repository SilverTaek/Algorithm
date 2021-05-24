package mincoding;

public class test0525_01 {

	
	static int arr[][] = {

			{ 1, 3, 7, 2 }, { 2, 2, 6, 1 }, { 1, 4, 5, 1 }, { 1, 1, 2, 1 }

	};

	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	
	
	static int temp = 0;
	static int mi = 9999999;
	public static void main(String[] args) {
		
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				
				for (int k = 0; k < 4; k++) {
					int ny = y + dy[k];
					int nx = x + dx[k];
					
					if(check(ny, nx)) {
					
					 temp += arr[ny][nx];
					 
					}
					
				}
				if(temp < mi) {
					 mi = temp;
				 }
				temp = 0;
			}
		}
		System.out.println(mi);
	}

	private static boolean check(int ny, int nx) {
		
		if(ny <0 || nx < 0 || ny >= 4 || nx >= 4) {
			return false;
		}
		return true;
	}

}
