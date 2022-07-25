package Today_22_05_26;

import java.util.*;

public class test {

	public static void main(String[] args) {
		
		
		int[]arr = {3,7,1,5};
					//-1 5 -1 7 stack
		
		Stack<Integer>temp = new Stack<>();
		Stack<Integer>ans = new Stack<>();
		
		
		for(int i=arr.length-1;i>-1;i--) {
			
			int num = arr[i];
			
			
			while(!temp.isEmpty()&&num>=temp.peek()) temp.pop();
			
			
			if(temp.isEmpty()) ans.add(-1);
			else ans.add(temp.peek());
			
			temp.add(num);
			
		}
		
		
		System.out.println(ans);
	}
}
