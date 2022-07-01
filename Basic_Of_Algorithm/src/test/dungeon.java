package test;

public class dungeon {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		
	int k = 80;
	int[][]dungeons = {{80,20},{50,40},{30,10}};
	boolean[]visited = new boolean[dungeons.length];
	
	dfs(dungeons,k,visited,0);
	
	System.out.println(answer);
	
	
	}
	
	static void dfs(int[][]dungeons,int k,boolean[]visited,int count) {
		
		
		
		for(int i=0;i<dungeons.length;i++) {
			if(!visited[i] && dungeons[i][0]<=k) {
				visited[i] = true;
				int newK = k - dungeons[i][1];
				dfs(dungeons,newK,visited,count+1);
				visited[i] = false;
			}
			
		}
		
		answer = Math.max(answer, count);
		
		
	}

}



