package Today_22_05_13;

import java.util.Stack;

public class right {

	public static void main(String[] args) {
		
		int [] arr = {3,5,1,7};
		
		Stack<Integer> temp = new Stack<>();
		Stack<Integer> ans = new Stack<>();
		
		
		
		for(int i=arr.length-1;i>-1;i--) {
			
			int num = arr[i];
			
			while(!temp.isEmpty() && num>=temp.peek()) {
				temp.pop();
			}
			
			if(temp.isEmpty()) {
				ans.add(-1);
			}else {
				ans.add(temp.peek());
			}
			temp.add(num);
			
		}
		
		int []result = new int[arr.length];
		
		for(int i=0;i<result.length;i++) result[i] = ans.pop();
		
		
		for(int i : result)System.out.print(i+" ");
		
	}
}
