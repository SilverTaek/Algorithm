import java.util.Scanner;

public class Swea_퍼펙트셔플 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int num = sc.nextInt();
			int a = 0;
			int b = 0;
			
			if(num % 2 != 0) {
				a = num/2 + 1;
				b = num/2;
			} else {
				a = num/2;
				b = num/2;
			}
			
			String[] arr1 = new String[a];
			String[] arr2 = new String[b];
			
			for (int j = 0; j < a; j++) {
				arr1[j] = sc.next();
			}
			for (int j = 0; j < b; j++) {
				arr2[j] = sc.next();
			}
			
			String[] arr3 = new String[num];
			
			for (int j = 0; j < num; j++) {
				if(j % 2 ==0) {
					arr3[j] = arr1[j/2];
				} else {
					arr3[j] = arr2[j/2];
				}
			}
			
			System.out.print("#" + (i + 1) + " ");
			for (int j = 0; j < num; j++) {
				System.out.print(arr3[j] + " ");
			}
			System.out.println();
		}

	}

}
