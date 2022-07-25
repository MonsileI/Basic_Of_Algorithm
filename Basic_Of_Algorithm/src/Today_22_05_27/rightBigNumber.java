package Today_22_05_27;

import java.util.*;

public class rightBigNumber {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,7};
		int []answer = new int[arr.length];
		
		Stack<Integer> tmp = new Stack<>();
		Stack<Integer> ans = new Stack<>();
		
		for(int i=arr.length-1;i>-1;i--) {
			
			int num = arr[i];
			
			
			while(!tmp.isEmpty() && num>=tmp.peek()) {
				tmp.pop();
			}
			
			if(tmp.isEmpty()) {
				ans.add(-1);
			}else {
				ans.add(tmp.peek());
			}
			
			tmp.add(num);
			
			
			
			
		}
		System.out.println(ans);
		
		for(int i=0;i<answer.length;i++) answer[i] = ans.pop();
		
		for(int i : answer)System.out.println(i);
		
	}
}
