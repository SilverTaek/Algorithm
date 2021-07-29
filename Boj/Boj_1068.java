import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_1068 {
	static int N, root, erased;
	static ArrayList<Integer>[] child;
	static int[] leaf;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		child = new ArrayList[N];
		leaf = new int[N];
		
		for(int i=0; i < N; i++) {
			child[i] = new ArrayList<>();
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i < N; i++) {
			int par = Integer.parseInt(st2.nextToken());
			if(par == -1) {
				root = i;
				continue;
			}
			child[par].add(i);
		}
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		erased = Integer.parseInt(st3.nextToken());
		
		pro();
	}

	private static void pro() {
		for(int i=0; i<N; i++) {
			if(child[i].contains(erased)) {
				child[i].remove(child[i].indexOf(erased));
			}
		}
		if(root != erased) dfs(root);
		System.out.println(leaf[root]);
		
	}

	private static void dfs(int x) {
		if(child[x].isEmpty()) {
			leaf[x] = 1;
		}
		for(int y: child[x]) {
			dfs(y);
			leaf[x] += leaf[y];
		}
		
	}

}
