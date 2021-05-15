import java.util.Arrays;
import java.util.Scanner;

public class Swea_1208 {
	static int map[];
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			int q = sc.nextInt();
			map = new int[100];
			for (int j = 0; j < 100; j++) {
				map[j] = sc.nextInt();
			}
			Arrays.sort(map);
			for (int k = 0; k < q; k++) {
				map[map.length-1] -= 1;
				map[0] +=1;
				Arrays.sort(map);
				
			}
			
			ans = map[map.length-1] - map[0];
			
			System.out.println("#" + i + " " + ans);
		}

	}

}
