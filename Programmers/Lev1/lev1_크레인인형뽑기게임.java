import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
       Stack<Integer> stack  = new Stack<>();
		int ans = 0;
		for(int move : moves) {
			if(board[board.length-1][move-1] != 0) {
				for(int j = 0; j < board.length; j++) {
					int doll = board[j][move-1];
					
					if(doll == 0) continue;
					else {
						if(isDollPopped(stack,doll)) ans+=2;
						board[j][move-1] = 0; break;
					}
				}
			}
		}
		return ans;
    }
    
    private static boolean isDollPopped(Stack<Integer> stack, int doll) {
		
		if(!stack.isEmpty() && stack.peek() == doll) {
			stack.pop();
			return true;
		}
		stack.push(doll);
		
		return false;
	}
}