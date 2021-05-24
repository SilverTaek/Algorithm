package mincoding;

public class Min0524_04 {

	public static int arr[] = {5, 7, 1, 2, 3};
	// 5712332175
	public static void main(String[] args) {
		bbq(0);
	}
	private static void bbq(int level) {
		
		System.out.print(arr[level]);
		if(level ==4) {
			System.out.print(arr[level]);
			return;
		}
		bbq(level + 1);
		System.out.print(arr[level]);
		
	}


}
