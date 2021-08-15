import java.util.Arrays;
import java.util.Scanner;

/*
 국어 점수가 감소하는 순서로
국어 점수가 같으면 영어 점수가 증가하는 순서로
국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)

12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
 */
public class Boj_10825 {
	
	static int N;
	static Elum[] a;
	public static class Elum implements Comparable<Elum>{
		String name;
		int korean, english, math;
		
		@Override
		public int compareTo(Elum other) {
			if (korean != other.korean) return other.korean - korean;
            if (english != other.english) return english - other.english;
            if (math != other.math) return other.math - math;
            return name.compareTo(other.name);
		}
	}
	
	public static void main(String[] args) {
		input();
		pro();

	}

	private static void pro() {
		Arrays.sort(a);
		for (int i = 0; i < N; i++) {
			System.out.println(a[i].name);
		}
		
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new Elum[N];
		for (int i = 0; i < N; i++) {
			a[i] = new Elum();
			a[i].name = sc.next();
			a[i].korean = sc.nextInt();
			a[i].english = sc.nextInt();
			a[i].math = sc.nextInt();
		}
		
	}

}
