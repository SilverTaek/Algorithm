
public class p_추석트랙픽 {
	
	static String str = "2016-09-15 20:59:57.421 0.351s";
	public static void main(String[] args) {
		str = str.substring(11).replace(":", "").replace("s", "");
		System.out.println(str);
//		
		int sec =  Integer.parseInt(str.substring(0,2))*3600 +
                Integer.parseInt(str.substring(2,4))*60+
                Integer.parseInt(str.substring(4,6));
		str = ""+ sec + str.substring(6);
		System.out.println(str);
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
