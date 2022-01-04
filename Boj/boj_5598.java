import java.util.Scanner;

public class boj_5598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if((char)(ch[i] - 3) < 'A') {
				ch[i] = (char)(ch[i] + 23);
			}else {
				ch[i] = (char) (ch[i] - 3);				
			}
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
