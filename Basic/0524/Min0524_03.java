package mincoding;

public class Min0524_03 {

	public static void main(String[] args) {
		bbq(1);

	}

	private static void bbq(int i) {
		
		
		System.out.print(i + "");
		if(i == 5) {
			return;
		}
		bbq(i + 1);
		System.out.print(i + "");
	}

}
