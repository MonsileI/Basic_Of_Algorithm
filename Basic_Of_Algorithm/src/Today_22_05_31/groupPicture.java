package Today_22_05_31;

public class groupPicture {
	
	static char[] member = {'A','C','F','J','M','N','R','T'};
	static boolean[] visited= new boolean[member.length];
	static int answer=  0;
	static String[] dt;
	
	public static void main(String[] args) {
		
	
		int n = 2;
		String [] data = {"N~F=0", "R~T>2"};
		dt = data;
		dfs(0,"");
		
		System.out.println(answer);
		
	}
	static boolean check(String now) {
		
		for(String str : dt) {
		
			int pos1 = now.indexOf(str.charAt(0));
			int pos2 = now.indexOf(str.charAt(2));
			int op = str.charAt(3);
			int idx = str.charAt(4) - '0';
			
			if(op=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(op=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}else if(op=='<') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}
			
		}
		
		return true;
		
	}
	
	static void dfs(int count, String now) {
		
		if(count==member.length) {
			if(check(now)) {
				answer++;
			}
			return;
		}
		
		for(int i=0;i<member.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + member[i];
				dfs(count+1,newOne);
				visited[i] = false;
						
			}
			
		}
		
		
	}
}
