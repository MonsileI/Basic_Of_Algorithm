package Today_22_05_26;

import java.util.Stack;

public class rightBigNumber {
	
	public static void main(String[] args) {
		
		int []arr = {1,5,3,0,2};
		 		   
		Stack<Integer> temp = new Stack<>();
		Stack<Integer> pra = new Stack<>();
		
		//5 3 2 2 0
		
		for(int i=arr.length-1;i>-1;i--) {
			
			int num = arr[i];
			
			while(!temp.isEmpty() && num>= temp.peek()) {
				temp.pop();
			}
			
			if(temp.isEmpty()) {
				pra.add(-1);
			}else {
				pra.add(temp.peek());
			}
			
			temp.add(num);
			
			
			
			
		}
		
	}

}
