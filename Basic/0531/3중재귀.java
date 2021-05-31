package mincoding;

public class test03 {

	public static char path[] = new char[3];
	public static char name[] = {'A', 'B', 'C'};
	
	public static void main(String[] args) {
		
		BBQ(0);

	}
	
	public static void BBQ(int level) {
		
		if(level == 3) {
			for (int i=0; i<3; i++) {
				System.out.print(path[i]);
				
			}
			System.out.println();
			return;
		}
			
		
		for (int i=0; i<3; i++) {
			
			path[level] = name[i];
			BBQ(level + 1);
			
		}
		
	}

}
