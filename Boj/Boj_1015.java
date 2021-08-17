import java.util.Arrays;
import java.util.Scanner;

public class Boj_1015 {

    static class Elem implements Comparable<Elem> {

        public int num, idx;

        @Override
        public int compareTo(Elem other) {
            return num - other.num;
        }
    }

    static int N;
    static int[] P;
    static Elem[] B;

    static void input() {
    	Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        B = new Elem[N];
        P = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = new Elem();
            B[i].num = sc.nextInt();
            B[i].idx = i;
        }
    }

    static void pro() {
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            P[B[i].idx] = i;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        input();
        pro();
    }

}
