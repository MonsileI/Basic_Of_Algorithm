package test;

public class color {

	public static void main(String[] args) {
		
		String[]temp = {"RRRBB", 
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
		
		boolean[][]visited = new boolean[map.length][map[0].length];
		boolean[][]visited2 = new boolean[map.length][map[0].length];
		
		int normal = 0;
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(!visited[i][j]) {
					dfs(i,j,map,visited);
					normal++;
				}
			}
		}
		
		
		int disabled = 0;
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(map[i][j]=='G') map[i][j] = 'R';
				
			}
		}
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(!visited2[i][j]) {
					dfs(i,j,map,visited2);
					disabled++;
				}
			}
		}
		
		System.out.println(normal);
		System.out.println(disabled);
	}
	
	static void dfs(int i,int j,char[][]map,boolean[][]visited) {
		
		int[][]move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		visited[i][j] = true;
		
		
		for(int d=0;d<4;d++) {
			
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			
			if(!visited[newI][newJ] && map[newI][newJ]==map[i][j]) {
				dfs(newI,newJ,map,visited);
			}
			
		}
		
		
	}
}
