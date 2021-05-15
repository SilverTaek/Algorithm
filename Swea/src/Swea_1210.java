import java.util.Scanner;

public class Swea_1210 {
	
	public static int[][] arr, dir = {{0,1}, {0,-1}, {-1,0}};
	public static int r, c ,ans = 0;
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			int tn = sc.nextInt();
			arr = new int[100][100];
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}
			
			while(true) {
				for(int i=0; i<3; i++) {
					int nx = r + dir[i][0];
					int ny = c + dir[i][1];
					
					if(isInside(nx, ny) && arr[nx][ny] == 1) {
						arr[nx][ny] = 0;
						r = nx;
						c = ny;
						break;
					}
				}
				
				if(r == 0) {
					ans = c;
					break;
				}
			}
			
			System.out.println("#" + tn + " " + ans);
		}
	}
		
	public static boolean isInside(int x, int y) {
		return x >= 0 && x < 100 && y >= 0 && y < 100;
	}
}
