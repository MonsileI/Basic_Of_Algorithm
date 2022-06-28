package Today_22_06_28;

public class dfs {
	
	static int answer = 0;
	static char [] member = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
	static boolean[] visited = new boolean[member.length];
	static String[]dataSample;
	
	public static void main(String[] args) {
		
		int n = 2;
		String []data = {"N~F=0", "R~T>2"};
		
		dataSample = data.clone();
		
		dfs("");
		
		System.out.println(answer);
		
	}
	static boolean check(String now) {
		
		for(String d : dataSample) {
			
			int pos1 = now.indexOf(d.charAt(0));
			int pos2 = now.indexOf(d.charAt(2));
			char op = d.charAt(3);
			int idx = (d.charAt(4) - '0') +  1;
			
			if(op=='=') {
				if(!(Math.abs(pos1-pos2)==idx)) return false;
			}else 	if(op=='>') {
				if(!(Math.abs(pos1-pos2)>idx)) return false;
			}else 	if(op=='<') {
				if(!(Math.abs(pos1-pos2)<idx)) return false;
			}
			
			
		}
		
		
		
		return true;
		
		
	}
	
	static void dfs(String now) {
		
		if(now.length()==member.length) {
			if(check(now)) answer++;
		}
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + member[i];
				dfs(newOne);
				visited[i] = false;
			}
		}
		
		
	}


}
