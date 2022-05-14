package Today_22_05_12;

import java.util.*;

public class rightbiggersoo {
	
	public static void main(String[] args) {
		
		int []A = {3,5,2,7};
		int[]answer = new int[A.length];
		
		Stack<Integer> ans = new Stack<>();
		Stack<Integer> tmp = new Stack<>();
		
		for(int i = A.length-1; i > -1 ; i--) {
			
			int num = A[i];
			
			while(!tmp.isEmpty() && (num >= tmp.peek())) {
				tmp.pop();
			}
			
			if(tmp.isEmpty()) {
				ans.add(-1);
			}else {
				ans.add(tmp.peek());
			}
			
			tmp.add(num);
			
		}
		
		for(int i = 0 ; i < answer.length;i++) System.out.println(ans.pop());
		
	}

}
