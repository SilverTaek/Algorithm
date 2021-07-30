
public class Co_2_1 {
	public int[] solution(int[] A, int K) {
		int length = A.length;
		if(length == 0) {
			return A;
		}
		for(int i=0; i<K; i++) {
			int last = A[length-1];
			for(int j=length-1; j>0; j--) {
				A[j] = A[j-1];
			}
			A[0] = last;
		}
		return A;
	}
}
