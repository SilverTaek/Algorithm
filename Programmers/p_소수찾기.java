import java.util.Arrays;
import java.util.HashSet;

// 중복하면 안됨
public class p_소수찾기 {

	static String numbers = "17";
	static char ch[];
	static char ans[];
	static int visit[];
	static int cnt = 0;
	static HashSet<String> hashSet = new HashSet<>();
	static String str = "";
	
	public static void main(String[] args) {
		ch = numbers.toCharArray();
		ans = new char[ch.length];
		visit = new int[ch.length];
		
		for (int i = 1; i <= ch.length; i++) {
			bbq(0, i);
			
		}
		
		
		for(String item : hashSet) {
			int int_val = Integer.parseInt(item);
			boolean flag = false;

			if(int_val == 1) flag = true;
			else if(int_val > 3) {
				if(int_val % 2 == 0) {
					
					flag = true;
				}
				
				int sqrt = (int)Math.sqrt(int_val);
				
				for (int i = 3; i <= sqrt; i+=2) {
					if(int_val % i == 0) {
						flag = true;
						break;
					}
				}
				
			}
			
			if(!flag) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	private static void bbq(int level, int l) {
			if(level == l) {
				for (int i = 0; i < ans.length; i++) {
					if(ans[0] != '0') {
						str += ans[i];
						String result = str.trim();
						hashSet.add(result);
					
					}
				
				}
				str = "";
				return;
				
			}
		
		for (int branch = 0; branch < ch.length; branch++) {
			
			if(visit[branch] != 1) {
				ans[level] = ch[branch];				
			}else {
				continue;
			}
			
			visit[branch] = 1;
			bbq(level + 1, l);
			visit[branch] = 0;
		}
		
	}
	
}
