package programmers_level_01;

import java.util.Stack;

public class no_4 {

	public static void main(String[] args) {
		
		
		int[][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int [] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<moves.length;i++) {
			
			int move = moves[i]-1;
			
			
			for(int i2 = 0; i2 <board.length;i2++) {
				
				if(board[i2][move]!=0) {
					
					if(stack.isEmpty()) {
						stack.add(board[i2][move]);
						board[i2][move]=0;
						break;
					}
					else {
						if(stack.peek()==board[i2][move]) {
							stack.pop();
							answer ++;
							board[i2][move]=0;
							break;
						}
					}
					
					
				
				}
				
				
				
			}
			
		}
		
		System.out.println(answer*2);
		
	}
}
