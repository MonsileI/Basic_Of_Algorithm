package Today_22_05_12;

public class changebracket {

	
	public static void main(String[] args) {
		
		String p = ")(";
		
		if(p.isEmpty())System.out.println("nope");
		else {
			
			String answer = change(p);
			System.out.println(answer);
		}
	
		
		
	}
	
	static String change(String w) {
		
		if(w.isEmpty()) return "";
		
		String u = "";
		String v = "";
		
		int l = 0;
		int r = 0;
		int i;
		
		for(i=0;i<w.length();i++) {
			
			char ch = w.charAt(i);
			
			if(ch=='(')l++;
			else r++;
			
			
			if(l==r) break;
			
		}
		
		u = w.substring(0,i+1);
		v = w.substring(i+1);
		
		if(isRight(u)) {
			u += change(v);
		}else {
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
		u = u.replaceAll("\\(\\)", "");
		
		return true;
	}
}
