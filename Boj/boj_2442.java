import java.util.Scanner;

public class boj_2442 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i=0;i<n;i++) {
			for(int j=1;j<2*n;j++) {
				if(j>=n-i && j<=n+i) { // �߾��� �������� +-i ���������� ���� ��´�.
					System.out.print("*");
				}else { // �ƴ� ���� �� �ڸ��� ������ ä���ش�.
					System.out.print(" ");
				}
				if(j> n+i) break; // j�� ���� ������ �Ѿ�� ���� �ݺ����� �����.
			}			
			System.out.println();
		}

	}

}
