import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj_1916 {
    static int N, M, start, end;
    static int[] dist;
    static ArrayList<Edge>[] edges;
    
    static class Edge {
        public int to, weight;

        public Edge(int _to, int _weight) {
            this.to = _to;
            this.weight = _weight;
        }
    }
    
    static class Info {
        public int idx, dist;

        public Info() {
        }

        public Info(int _idx, int _dist) {
            this.idx = _idx;
            this.dist = _dist;
        }
    }
    
	public static void main(String[] args) {
		input();
        pro();

	}

	private static void pro() {
		dijkstra(start);
        System.out.print(dist[end]);
		
	}

	private static void dijkstra(int start) {
		// 모든 정점까지의 대한 거리를 무한대로 초기화 해주기.
		for(int i=1; i<=N; i++) dist[i] = Integer.MAX_VALUE;
		
		  // 최소 힙 생성
        PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        // 다른 방법) PriorityQueue<Info> pq = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);

        // 시작점에 대한 정보(Information)을 기록에 추가하고, 거리 배열(dist)에 갱신해준다.
        pq.add(new Info(start, 0));
        dist[start] = 0;
		
        // 거리 정보들이 모두 소진될 때까지 거리 갱신을 반복한다.
        while (!pq.isEmpty()) {
            Info info = pq.poll();
            
            // 꺼낸 정보가 최신 정보랑 다르면, 의미없이 낡은 정보이므로 폐기한다.
            if (dist[info.idx] != info.dist) continue;

            // 연결된 모든 간선들을 통해서 다른 정점들에 대한 정보를 갱신해준다.
            for (Edge e : edges[info.idx]) {
                if (dist[info.idx] + e.weight >= dist[e.to]) continue;

                // e.to 까지 갈 수 있는 더 짧은 거리를 찾았다면 이에 대한 정보를 갱신하고 PQ에 기록해준다.
                dist[e.to] = dist[info.idx] + e.weight;
                pq.add(new Info(e.to, dist[e.to]));
            }
        }
	}

	private static void input() {
		Scanner scan = new Scanner(System.in);
		
        N = scan.nextInt();
        M = scan.nextInt();
        dist = new int[N + 1];
        edges = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) edges[i] = new ArrayList<Edge>();
        for (int i = 1; i <= M; i++) {
            int from = scan.nextInt();
            int to = scan.nextInt();
            int weight = scan.nextInt();
            edges[from].add(new Edge(to, weight));
        }
        start = scan.nextInt();
        end = scan.nextInt();
		
	}

}
