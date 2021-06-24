import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1759 {

	static int N, M, selected[];
	static char[] chars;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		chars = new char[N + 1];
		selected = new int[M + 1];

		String[] tokens = br.readLine().split(" ");
		for (int i = 1; i <= N; i++) {

			chars[i] = tokens[i - 1].charAt(0);
		}

		Arrays.sort(chars);
		rec_func(1);

		br.close();
		bw.flush();
		bw.close();
	}

	static void rec_func(int k) throws IOException {

		if (k == M + 1) {
			int muem = 0;
			int jaem = 0;
			for (int j = 1; j <= M; j++) {
				if (isValue(chars[selected[j]])) {
					muem++;
				} else {
					jaem++;
				}

			}

			if (muem >= 1 && jaem >= 2) {
				for (int i = 1; i <= M; i++) {

					bw.write((chars[selected[i]]));

				}
				bw.newLine();
			}
		} else {
			for (int cand = selected[k - 1] + 1; cand <= N; cand++) {
				selected[k] = cand;
				rec_func(k + 1);
				selected[k] = 0;

			}
		}
	}

	private static boolean isValue(char x) {

		return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
	}
}
