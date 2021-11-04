import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class p_¿ß¿Â {

	static String ans[][] = {
			{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}
			};
	
	static public int solution(String[][] clothes) {
		int answer = 1;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < clothes.length; i++) {
			set.add(clothes[i][1]);
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		for(String key : set) {
			answer = answer * (map.get(key) + 1);
		}
		
		return answer - 1;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(ans));

	}

}
