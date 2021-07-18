
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
 
public class Boj_2667 {
 
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Node> q = new LinkedList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        map = new int[N][N];
        visited = new boolean[N][N];
        
        for (int i = 0; i < N; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = temp[j] - '0';
            }
        }
        
        int mark = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 0 || visited[i][j])
                    continue;
                int cnt = 0;
                visited[i][j] = true;
                q.add(new Node(i, j));
                
                while(!q.isEmpty()) {
                    
                    Node cur = q.poll();
                    cnt++;
                    
                    for (int k = 0; k < 4; k++) {
                        int nx = cur.x + dx[k];
                        int ny = cur.y + dy[k];
                        
                        if(!isRange(nx, ny) || visited[nx][ny] || map[nx][ny] == 0)
                            continue;
                        
                        visited[nx][ny] = true;
                        q.add(new Node(nx, ny));
                    }
                }
                list.add(cnt);
                mark++;
            }
        }
        
        Collections.sort(list);
        System.out.println(mark);
        for(int cnt : list) {
            System.out.println(cnt);
        }
    }
    
    static boolean isRange(int x, int y) {
        if( x < 0 || x >= N || y < 0 || y >= N) return false;
        return true;
    }
}
 
class Node {
    int x;
    int y;
    
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}