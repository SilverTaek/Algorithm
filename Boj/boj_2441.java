import java.util.Scanner;

/*
 * -----
 *  ----
 *   ---
 *    --
 *     -
 */
public class boj_2441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = x; i > 0; i--) {
			for (int k = 0; k < x - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
