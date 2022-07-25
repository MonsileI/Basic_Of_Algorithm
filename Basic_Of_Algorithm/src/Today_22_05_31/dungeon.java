package Today_22_05_31;

public class dungeon {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		
		int k = 80;
		int[][]dungeons = {{80,20},{50,40},{30,10}};
		boolean[]visited = new boolean[dungeons.length];
		
		dfs(k,dungeons,visited,0);
		
		System.out.println(answer);
		
	}
	
	static void dfs(int k, int[][]dungeons,boolean[]visited,int count) {
		
		
		
		for(int i=0;i<dungeons.length;i++) {
			if(!visited[i] && dungeons[i][0]<=k) {
				visited[i] = true;
				int newK = k - dungeons[i][1];
				dfs(newK,dungeons,visited,count+1);
				visited[i] = false;
			}
		}
		
	
		answer = Math.max(answer, count);
	
	}

}
