package Today_22_05_26;

public class backJoon_color {

	public static void main(String[] args) {
		
		String [] color = {"RRRBB","GGBBB","BBBRR","BBRRR","RRRRR"};
		char[][] map = new char[color.length][color[0].length()];
		
		boolean[][] visited = new boolean[map.length][map[0].length];
		boolean[][] visited2 = new boolean[map.length][map[0].length];
		
		int normal = 0;
		int special = 0;
		
		
		for(int i=0;i<color.length;i++) {
			for(int j=0;j<color[0].length();j++) {
				map[i][j] = color[i].charAt(j);
			}
		}
		
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(!visited[i][j]) {
					dfs(visited,map,i,j);
					normal++;
				}
			}
		}
		System.out.println(normal);

		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(map[i][j]=='R') map[i][j]='G';
			}
		}
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(!visited2[i][j]) {
					dfs(visited2,map,i,j);
					special++;
				}
			}
		}
		
	
		
		System.out.println(special);
		
	}
	
	static void dfs(boolean[][]visited, char[][]map,int i,int j) {
		
		visited[i][j] = true;
		
		
		int[][]move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		
		for(int d=0;d<4;d++) {
			
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			
			if(map[i][j]==map[newI][newJ] && !visited[newI][newJ]) {
				dfs(visited,map,newI,newJ);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
