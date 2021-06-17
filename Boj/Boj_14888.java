import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14888 {
	
	static int N, max, min, nums[], selected[], operators[];
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		nums = new int[N+1];
		operators = new int[5];
		selected = new int[N+1];
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=4; i++) {
			operators[i] = Integer.parseInt(st2.nextToken());
		}
		
		rec_func(1);
		System.out.println(max);
		System.out.print(min);
	}
	
	static void rec_func(int k) {
		if(k == N) {
			
			int value = calculator();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
		else {
			for(int cand=1; cand<=4; cand++) {
				if(operators[cand]>=1) {
					operators[cand]--;
					selected[k] = cand;
					rec_func(k+1);
					operators[cand]++;
					selected[k]=0;
				}
			}
		}
	}
	
	static int calculator() {
		int value = nums[1];
		for(int i=1; i<=N-1; i++) {
			if(selected[i]==1) {
				value = value + nums[i+1];
			} else if(selected[i]==2) {
				value = value - nums[i+1];
			}else if(selected[i]==3) {
				value = value * nums[i+1];
			}else if(selected[i]==4) {
				value = value / nums[i+1];
			}
		}
		return value;
	}
}
