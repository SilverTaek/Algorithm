package pro_22;

public class 경로를출력하자 {
// level = 2 / branch = 3
	static char ch[] = {'A','B','C'};
	static char ans[] = new char[2];
	public static void main(String[] args) {
		
		rec_func(0);
		
	}

	private static void rec_func(int level) {
		
		if(level == 2) {
			for (int i = 0; i < 2; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			
			return;		
		}
		
		for (int i = 0; i < 3; i++) {
			ans[level] = ch[i];
			rec_func(level+1);
			ans[level] = ' ';
		}
	}

}
