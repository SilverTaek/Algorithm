import java.util.*;

public class Solution {
	int[] count = new int[100001];

	public int solution(int[] p) {

		int answer = 0;
		int size = p.length;
		int start = 100000;
		int end = 0;

		for (int i = 0; i < size; i++) {
			
			count[p[i]]++;
			start = Math.min(start, p[i]);
			end = Math.max(end, p[i]);
		}

		while (true) {
			if (start == 100000 && end == 0)
				break;
			int min = 100000;
			int max = 0;
			int cnt = 0;
			for (int i = start; i <= end; i++) {
				if (count[i] == 0)
					continue;

				count[i]--;
				cnt++;
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
			if (cnt == 0)
				break;

			answer += cnt - 1;
			start = min;
			end = max;

		}

		return answer;
	}
}