import java.util.Scanner;
// n * (n-1) + n * 
public class boj_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int multi = 1;
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			multi *= i;
			//sum += multi;
		}
		
		System.out.println(multi);

	}

}
