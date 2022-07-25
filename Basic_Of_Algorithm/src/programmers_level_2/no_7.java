package programmers_level_2;

public class no_7 {

	public static void main(String[] args) {
		
		String p = ")(";
		
		String answer = change(p);
		
		System.out.println(answer);
		
	}
	
	static String change(String w) {
		
		if(w.isEmpty()) return "";
		
		int l = 0, r = 0;
		
		int i;
		
		for(i=0;i<w.length();i++) {
			
			if(w.charAt(i)=='(') l++;
			else r++;
			
			if(l==r) break;
		}
		
		String u = w.substring(0,i+1);
		String v = w.substring(i+1);
		
		if(isRight(u)) u += change(v);
		else {
			String str = "(" + change(v) + ")";
			u = u.substring(1,u.length()-1);
			u = u.replaceAll("\\(", ".");
			u = u.replaceAll("\\)", "(");
			u = u.replaceAll("\\.", ")");
			str += u;
			return str;
		}
		return u;
	}
	static boolean isRight(String u) {
		
		if(u.charAt(0)==')') return false;
		
		
		return true;
	}
	
}
