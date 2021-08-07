
class Solution {
    public int[] solution(int N, int[] A) {
          int[] counter = new int[N];
    int tmpMaxCounter = 0;
    int doneMaxCounter = 0;
 
    for (int i = 0; i < A.length; i++) {
        if (A[i] > N) {
            doneMaxCounter = tmpMaxCounter;
        }
        else {
            if (counter[A[i] - 1] < doneMaxCounter) {
                counter[A[i] - 1] = doneMaxCounter;
            }
 
            counter[A[i] - 1]++;
 
            if (counter[A[i] - 1] > tmpMaxCounter) {
                tmpMaxCounter = counter[A[i] - 1];
            }
        }
    }
 
    if (doneMaxCounter > 0) {
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < doneMaxCounter) {
                counter[i] = doneMaxCounter;
            }
        }
    }
 
    return counter;
    }
}
