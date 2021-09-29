import java.io.*;
import java.util.*;

public class boj_1662 {
	static int[] rightIdxs = new int[51];
	static String[] input;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		input = br.readLine().split("");
		
		for(int i=0; i< input.length; i++) {
			String value = input[i];
			if(value.equals("(")) stack.add(i); // ( �� ��ġ
			if(value.equals(")")) rightIdxs[stack.pop()] = i; // rightIdxs �迭 [¦�� '(' ��ȣ]��°�� ')'�� ��ġ�� �Ҵ��Ѵ�. 
		}
		
		System.out.println(getLength(0, input.length));
	}
	
	private static int getLength(int start, int end) {
		int len = 0;
		for(int i=start; i< end; i++) {
			if(input[i].equals("(")) {
				len += Integer.parseInt(input[i-1]) * getLength(i+1, rightIdxs[i]) -1 ; // -1�� '(' �տ� �ִ� ���� ����(1)�� ���� ��!
				i = rightIdxs[i];
			} else {
				len++;
			}
		}
		return len;
	}
}