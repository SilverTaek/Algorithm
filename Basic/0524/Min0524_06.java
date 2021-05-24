package mincoding;

public class Min0524_06 {

	public static void main(String[] args) {
		bbq(1);
	}

	private static void bbq(int level) {
		
		if(level == 5) {
			return;
		}
		System.out.print(level);
		bbq(level + 1);
		System.out.print(level);
	}

}
