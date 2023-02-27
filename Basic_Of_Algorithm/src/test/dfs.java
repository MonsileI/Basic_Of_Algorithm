package test;

public class dfs {

	static int answer = Integer.MAX_VALUE;
	
	static String t;
	static boolean[] visited;
	
	public static void main(String[] args) {
		
		
		String begin = "hit";
		String target = "cog";
		String [] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		
		
		t = target;
		
		visited = new boolean[words.length];
		
		dfs(begin,words,0);
		
		System.out.println(answer);
		
		
	}
	
	static void dfs(String begin, String [] words , int count) {
		
		if(begin.equals(t)) {
			System.out.println(begin + " : " + count);
			answer = Math.min(answer, count);
			return;
		}
		
		
		for(int i=0;i<words.length;i++) {
			int c = 0;
			for(int j=0;j<begin.length();j++) {
				if(words[i].charAt(j)!=begin.charAt(j)) {
					c++;
				}
			}
			
			
			if(!visited[i] && c==1) {
				visited[i]= true;
				begin = words[i];
				dfs(begin,words,count+1);
				visited[i] = false;
			}
		}
		
	}
}
