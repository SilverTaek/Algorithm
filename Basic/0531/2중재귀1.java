package mincoding;

public class test01 {

	public static void main(String[] args) {
		
		bbq(0);

	}

	public static void bbq(int level) {
		
		if(level == 2) return;
		
		bbq(level + 1);
		bbq(level + 1);
		bbq(level + 1);
	}

}
