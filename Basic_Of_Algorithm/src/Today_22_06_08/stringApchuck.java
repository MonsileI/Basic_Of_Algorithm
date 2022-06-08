package Today_22_06_08;

public class stringApchuck {

	public static void main(String[] args) {
		
		String s = "xababcdcdababcdcd";
		
		int answer = Integer.MAX_VALUE ;
		
		for(int i=1;i<=s.length()/2;i++) {
			
			String result = "";
			String now = "";
			String next = "";
			int hit = 1;
			
			for(int j=0;j<=s.length()/i;j++) {
				
				int start = i * j;
				int end = i * (j+1) < s.length() ? i * (j+1) : s.length();
				
				next = s.substring(start,end);
				
				if(now.equals(next)) {
					hit++;
				}else {
					result += hitProess(hit) + now;
					hit = 1;
				}
				
				
				now = next;
				
			}
			
			result += hitProess(hit) + now;

			answer = Math.min(answer, result.length());
			
			System.out.println(result+" -> " +result.length());
			
			
		}
		
		if(answer==Integer.MAX_VALUE) answer=1;
		
		System.out.println(answer);
		
		
		
	}
	static String hitProess(int hit) {
		return hit>1 ? String.valueOf(hit) : "";
	}
}
