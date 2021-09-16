import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gabia01 {
	// 1. str를 다 소문자로 바꾸기
	// 2. str.charAt으로 검사와 알파벳 배열 ans 0 ~ 25 a ~ z 
	// 3. a 이면 0 , b 이면 1 ++ 해주기
	
	static String str = "His comments came after Pyongyang announced it had a plan to fire four missiles near the US territory of Guam.";
	static int ans[] = new int['z' + 1];
	static String Sans = "";
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		String low_str = str.toLowerCase();
		for(int i=0; i<low_str.length(); i++) {
			ans[low_str.charAt(i)] ++;
			
		}
		
		for (int i = 'a'; i <= 'z'; i++) {
			if(ans[i] == 0) list.add(i);
			else if(ans[i] !=0) Sans = "perfect";
		}
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			Sans += (char)list.get(i).intValue();
		}
		System.out.println(Sans);
	}

}
