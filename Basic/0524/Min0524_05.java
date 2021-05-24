package mincoding;

public class Min0524_05 {

	public static void main(String[] args) {
		bbq(1);
	}

	private static void bbq(int level) {
		// TODO Auto-generated method stub
		
		System.out.print(level + "");
		if(level == 4) {
			System.out.print(level);
			return;
		}
		bbq(level + 1);
		System.out.print(level + "");
	}

}
