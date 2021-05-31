package mincoding;

public class test02 {

	public static char path[] = new char[3];
	public static char name[] = {
		'A','B'	
	};
	
	public static void main(String[] args) {
		
		BBQ(0);

	}
	
	public static void BBQ(int level) {
		
		if(level == 3) {
			for (int i = 0; i < 3; i++) {
				System.out.print(path[i]);
			}
			System.out.println();
			return;
		}
		
//		path[level] = name[0];
//		BBQ(level + 1);
//		
//		path[level] = name[1];
//		BBQ(level + 1);
		
		for (int i = 0; i <=1; i++) {
			path[level] = name[i];
			BBQ(level + 1);
		}
	}

}
