package pro_21;

// br : 3 , lv : 2
public class 재귀호출이3개일때 {

	public static void main(String[] args) {
		rec_func(0);

	}
	
	public static void rec_func(int level) {
		
		if(level == 2) return;
		
		for(int i=0; i<3; i++) {
			rec_func(level + 1);
			
		}
	}

}
