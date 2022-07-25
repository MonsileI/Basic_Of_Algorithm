package programmers_level_2;

public class no_14 {

	public static void main(String[] args) {
		
		String p = "()))((()";
		
		System.out.println(solution(p));
		
	}
	
	static String solution(String p) {
		
		String answer = change(p);
		
		
		
		return answer;
		
		
	}
	static String change(String w) {
		
		if(w.isEmpty())return "";
		
		String u = "";
		String v = "";
		
		int l = 0;
		int r = 0;
		int i;
		for(i=0;i<w.length();i++) {
			
			if(w.charAt(i)==')') l++;
			else r++;
			
			if(l==r) break;
			
		}
		
		u = w.substring(0,i+1);
		v = w.substring(i+1,w.length());
		
		if(isRight(u)) {
			u = u + change(v);
		}else {
			String newU = "(" + change(v) + ")";
			u = u.substring(1,u.length()-1);
			u = u.replaceAll("\\(", "\\.");
			u = u.replaceAll("\\)", "\\(");
			u = u.replaceAll("\\.", "\\)");
			newU += u;
			u = newU;
		}
		
		
		return u;
		
		
	}
	
	static boolean isRight(String u) {
		
		if(u.charAt(0)==')') return false;
		return true;
		
	}
	
}
