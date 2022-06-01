package programmers_level_01;

import java.util.Stack;

public class crain {
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		
		for(int mov : moves) {
			
			mov--;
			
			for(int i=0;i<board.length;i++) {
				
				if(board[i][mov]!=0) {
					if(stack.isEmpty()) {
						stack.add(board[i][mov]);
						board[i][mov] = 0;
						break;
					}
					else {
						if(stack.peek()==board[i][mov]) {
							stack.pop();
							answer++;
						}else {
							stack.add(board[i][mov]);
						}
						board[i][mov] = 0;
						break;
					}
					
				}
				
			}
			
			
		}
		
		
		
		System.out.println(answer*2);
		
		
		
		
	}

}
