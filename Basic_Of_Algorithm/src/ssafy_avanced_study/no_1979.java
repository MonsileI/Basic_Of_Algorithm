package ssafy_avanced_study;

import java.util.Scanner;
import java.util.Stack;

public class no_1979 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
		
			String answer = "#"+test_case+" ";
			
			int size = sc.nextInt();
			int len = sc.nextInt();
			int ans = 0;
			
			int [][]map = new int[size][size];
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//가로
			
			for(int i=0;i<size;i++) {
				Stack<Integer> stack = new Stack<>();
				for(int j=0;j<size;j++) {
					
					if(map[i][j]==1) stack.add(1);
					else stack.add(0);
				}
				int count = 0;
				
				while(!stack.isEmpty()) {
					
					if(stack.isEmpty()) break;
			
					if(stack.peek()==1) count++;
					else if(stack.peek()==0) count = 0;
						
			
					stack.pop();	
					
					if(count==len) {
						if(!stack.isEmpty()&&stack.peek()==0) {
							ans++;
							count = 0;
							stack.pop();
						}else if(stack.isEmpty()) {
							ans++;
						}
					}
					
				}
				
			}
			
			//세로
			
			for(int j=0;j<size;j++) {
				Stack<Integer> stack = new Stack<>();
				for(int i=0;i<size;i++) {
					
					if(map[i][j]==1) stack.add(1);
					else stack.add(0);
				}
				int count = 0;
				
				while(!stack.isEmpty()) {
					
					if(stack.isEmpty()) break;
				
					if(stack.peek()==1) count++;
					else if(stack.peek()==0) count = 0;
						
					stack.pop();
					
					if(count==len) {
						if(!stack.isEmpty()&&stack.peek()==0) {
							ans++;
							count = 0;
							stack.pop();
						}else if(stack.isEmpty()) {
							ans++;
						}
					}
					
				}
				
			}
			
			answer += ans;
			
			System.out.println(answer);
			
			
			
		}
	}
}