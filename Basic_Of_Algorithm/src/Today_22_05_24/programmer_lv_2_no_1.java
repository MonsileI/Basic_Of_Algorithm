package Today_22_05_24;

public class programmer_lv_2_no_1 {
	
	public static void main(String[] args) {
		
		
		
		String s = "aabbaccc";
		
		int answer = Integer.MAX_VALUE;
		
		
		for(int i=1;i<=s.length()/2;i++) {
			
				String result ="";
				String next = "";
				String now = "";
				int hit = 1;
				
			for(int j=0;j<=s.length()/i;j++) {
				
				int start = i * j;
				int end = i * ( j + 1 ) > s.length() ? s.length():i*(j+1) ;
				
				next = s.substring(start,end);
				
				if(now.equals(next)) {
					hit++;
				}else {
					
					result += processHit(hit) + now;
					hit = 1;
				}
				now = next;
				
				
			}
			result += processHit(hit) + now;
			
			System.out.println(result + " : " + result.length() + " 개");
			
			answer = Math.min(answer, result.length());
		}
		
		System.out.println("답 :" + answer+" 개 ");
		
		
	}
	static String processHit(int hit) {
		return hit>1 ? String.valueOf(hit) : "";
	}

}
