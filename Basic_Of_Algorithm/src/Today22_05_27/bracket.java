package Today22_05_27;

import java.util.Stack;

public class bracket {
	
	public static void main(String[] args) {
		
		String s = "[)(]";
		int answer = 0;
		
		for(int i=0;i<s.length();i++) {
			
			String temp = s.substring(i);
			
			temp += s.substring(0,i);
		
			Stack<Character> stack = new Stack<>();
			
			for(int j=0;j<temp.length();j++) {
				
				char ch = temp.charAt(j);
				
				if(stack.isEmpty()) stack.add(ch);
				else {
					
					if(stack.peek()=='(' ) {
						if(ch==')')stack.pop();
						else stack.add(ch);
					}else if(stack.peek()=='[' ) {
						if(ch==']')stack.pop();
						else stack.add(ch);
					}else if(stack.peek()=='{' ) {
						if(ch=='}')stack.pop();
						else stack.add(ch);
					}
					
				}
				
			}
			
			
			if(stack.isEmpty()) answer++;
			

		}
		
		System.out.println(answer);
			
	}

}
