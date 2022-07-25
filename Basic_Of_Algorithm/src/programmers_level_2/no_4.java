package programmers_level_2;

public class no_4 {
	
	static char[] member = {'A','C','F','J','M','N','R','T'};

	static String[]datas;
	static int answer = 0;
	
	public static void main(String[] args) {
		
		int n = 2;
		
		String[]data = {"N~F=0", "R~T>2"};
		
		
		datas = data.clone();
		
		boolean[]visited = new boolean[member.length];
		
		dfs(visited,"");
		
		System.out.println(answer);
		
	}
	static void dfs(boolean[]visited,String now) {
		
		if(now.length()==member.length) {
			if(check(now)) answer++;
			
			return;
		}
		
		
		for(int i=0;i<visited.length;i++) {
			
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + member[i];
				dfs(visited,newOne);
				visited[i] = false;
			}
			
			
		}
		
	}
	static boolean check(String now) {
		
		for(String data : datas) {
			
			int pos1 = now.indexOf(data.charAt(0));
			int pos2 = now.indexOf(data.charAt(2));
			char ch = data.charAt(3);
			int idx = data.charAt(4)-'0';
			
			if(ch=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(ch=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}else if(ch=='<') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}
			
		}
		
		
		return true;
	}
	
}
