package Today_22_06_09;

public class no_2 {
	
	static char[]member = {'A','C','F','J','M','N','R','T'};
	static int answer = 0;
	static boolean[ ] visited;
	static String[]d;
	
	public static void main(String[] args) {
		
		int n = 2;
		
		String[]data = {"N~F=0", "R~T>2"};
		
		d = data.clone();
		
		visited = new boolean[member.length];
		
		dfs("");
		
		System.out.println(answer);
		
	}
	
	static boolean check(String now) {
		
		for(String str : d) {
			
			int pos1 = now.indexOf(str.charAt(0));
			int pos2 = now.indexOf(str.charAt(2));
			char op = str.charAt(3);
			int idx = str.charAt(4)-'0';
			
			if(op=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(op=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}else if(op=='=') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}
			
		}
		

		return true;
		
		
	}
	
	static void dfs(String now) {
		
		if(now.length()==member.length) {
			if(check(now)) answer++;
			
			
			return;
		}
		
		
		for(int i=0;i<member.length;i++) {
			if(!visited[i]) {
				visited[i]= true;
				String next = now + member[i];
				dfs(next);
				visited[i] = false;
			}
		}
		
	}

}
