package Today_22_05_31;

import java.util.Stack;

public class changeBracket {

	public static void main(String[] args) {
		
		
		String p = "()))((()";
		
		String result = change(p);
		
		System.out.println(result);
		
		
		
	}
	static String change(String w) {
		
		if(w.isEmpty()) return "";
		
		String u = "";
		String v = "";
		
		int i;
		int left =0;
		int right = 0;
		
		for(i=0;i<w.length();i++) {
			
			char ch = w.charAt(i);
			
			if(ch==')') right++;
			else left++;
			
			if(right==left) break;
				
		}
		
		u = w.substring(0,i+1);
		v = w.substring(i+1,w.length());
		
		String result = "";
		
		if(right(u)) {
			
			result = u + change(v);
		}else {
			
			result = "(" + change(v) + ")";
			u = u.substring(1,u.length()-1);
			u = u.replaceAll("\\(", "\\.");
			u = u.replaceAll("\\)", "\\(");
			u = u.replaceAll("\\.", "\\)");
			result += u;
			
			
		}
		
		return result;
		
		
		
	}
	
	static boolean right(String u) {
		
		Stack<Character>st = new Stack<>();
		
		for(int i=0;i<u.length();i++) {
			char ch = u.charAt(i);
			if(st.isEmpty()) st.add(ch);
			else {
				
				if(st.peek()=='(') {
					if(ch==')') st.pop();
					else st.add(ch);
				
				}
			}
		
		}
		
		if(st.isEmpty())return true;
		else return false;
	}
}
