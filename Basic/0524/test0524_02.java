package mincoding;

public class test0524_02 {

	public static void bbq(int level) {
		
		if(level == 3) {
			return;
		}
		
		System.out.println(level + "");
		bbq(level + 1);
		System.out.println(level + "");
		
	}
	public static void main(String[] args) {
		bbq(0);

	}

}
