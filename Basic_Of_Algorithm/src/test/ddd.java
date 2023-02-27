package test;

public class ddd {
	
	public static void main(String[] args) {
		
		
		int n = 3;
		
		int[][]computers = {{1,1,0},{1,1,0},{0,0,1}};
		
		int answer = 0;
		
		boolean[]visited = new boolean[computers.length];
		
		for(int i=0;i<computers.length;i++) {
			
			if(!visited[i]) {
				dfs(visited,computers,i);
				answer++;
			}
			
		}
		
		System.out.println(answer);
	}
	static void dfs(boolean[]visited,int[][]computers,int node) {
		
		visited[node] = true;
		
		for(int i=0;i<computers.length;i++) {
			if(!visited[i] && computers[node][i]==1) {
				dfs(visited,computers,i);
			}
		}
		
	}

}
