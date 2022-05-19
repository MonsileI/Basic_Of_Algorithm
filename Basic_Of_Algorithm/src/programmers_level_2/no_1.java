package programmers_level_2;

public class no_1 {
	
	public static void main(String[] args) {
		
		String s ="abcabcabcabcdededededede";	
		
		int answer = Integer.MAX_VALUE;
		
		for(int i=1;i<=s.length()/2;i++) {
				
			String now = "",next = "";
			String result = "";
			int hit = 1;
			for(int j=0;j<=s.length()/i;j++) {
				
				int start = j * i;
				int end = i * (j+1) > s.length() ? s.length() : i  * (j+1);
				
				now = next;
				next = s.substring(start,end);
				
				if(now.equals(next)) {
					hit++;
				}else {
					result += processHit(hit) + now;
					hit = 1;
				}
				
				
				
				
			}
			
			result += processHit(hit) + next;
			
			System.out.println(result);
			
			answer = Math.min(answer, result.length());
		}
		
		
		System.out.println(answer);
		
		
		
	}
	static String processHit(int hit) {
		return hit > 1 ? String.valueOf(hit) : "";
	}

}
