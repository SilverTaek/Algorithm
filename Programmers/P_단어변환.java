import java.util.*;

class Node {
	String word;
	int cnt;
	
	Node(String word, int cnt) {
		this.word = word;
		this.cnt = cnt;
	}
}

class Solution {
	public int solution(String begin, String target, String[] words) {
		Queue<Node> q = new LinkedList<>();
		boolean[] visit = new boolean[words.length];
		
		q.offer(new Node(begin, 0));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			if(node.word.equals(target))
				return node.cnt;
			
			for(int i=0; i<words.length; i++) {
				if(visit[i]) continue;
				if(changeable(node.word, words[i])) {
					q.offer(new Node(words[i], node.cnt+1));
					visit[i] = true;
				}
			}
		}
		return 0;
	}
	
	private boolean changeable(String from, String to) {
		int diff = 0;
		
		for(int i=0; i<to.length(); i++) {
			if(from.charAt(i) != to.charAt(i))
				diff++;
		}
		
		if(diff == 1) return true;
		return false;
	}
}
