package interestingAlgorithm;


public class bruthForce_backjoon {

	static int normal = 0;
	static boolean visited[][];

	public static void main(String[] args) {
		
	String []temp =	{"RRRBB",
					 "GGBBB",
					 "BBBRR",
					 "BBRRR",
					 "RRRRR"};
	
	char[][]map = new char[temp.length][temp[0].length()];
	
	
	for(int i=0;i<map.length;i++) {
		for(int j=0;j<map[0].length;j++) {
			map[i][j] = temp[i].charAt(j);
		}
	}
	
	visited = new boolean[map.length][map[0].length];
	
	for(int i=0;i<map.length;i++) {
		for(int j=0;j<map[0].length;j++) {
			if(!visited[i][j]) {
				dfs(map,i,j);
				normal++;
			}
		}
		
	}
	
	
	
	dfs(map,0,0);
	
	System.out.println(normal);
	
	}
	static void dfs(char[][]map,int i,int j){
		
		visited[i][j] = true;
		int[][]move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		for(int d=0;d<4;d++) {
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			
			if(!visited[newI][newJ] && map[newI][newJ]==map[i][j]) {
				dfs(map,newI,newJ);
			}
			
			
		}
		
		
		
		
		
	}
	
}
