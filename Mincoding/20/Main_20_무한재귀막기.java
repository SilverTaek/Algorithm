package mincoding;

public class Main_20_무한재귀막기 {

	public static void main(String[] args) {
		bbq(1);

	}

	private static void bbq(int level) {
		
		if(level == 5) {
			return;
		}
		bbq(level + 1);
	}

}
