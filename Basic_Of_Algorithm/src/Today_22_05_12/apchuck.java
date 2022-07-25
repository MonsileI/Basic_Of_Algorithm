package Today_22_05_12;

public class apchuck {

	public static void main(String[] args) {
		
		String s = "ababcdcdababcdcd";
		
		
		int answer = Integer.MAX_VALUE;
		
		
		for(int i=1;i<=s.length()/2;i++) {
			
			
			String result = "";
			String now = ""; String next = "";
			int count = 1;
			
			for(int j=0;j<=s.length()/i;j++) {
				
				
				int start = j*i;
				
				int end = s.length() > i * (j+1) ? i * (j+1) : s.length();
				
				now = next;
				
				next = s.substring(start,end);
				
				if(now.equals(next)) {
					count++;
				}else {
					result += check(count) + now;	
					count = 1;
				}
				
				
				
			}
			
			result += check(count) + next;
			
			System.out.println(result + " -> 갯수 : "+ result.length());
			
			answer = Math.min(answer, result.length());
			
		}
		System.out.println();
		System.out.println("답 : " + answer);
		
	}
	
	static String check(int count) {
		return count > 1 ? String.valueOf(count) : ""; 
	}
}
