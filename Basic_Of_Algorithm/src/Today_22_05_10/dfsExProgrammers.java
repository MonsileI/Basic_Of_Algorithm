package Today_22_05_10;


public class dfsExProgrammers {

	public static void main(String[] args) throws Exception {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		int[][]temp = new int[maps.length][maps[0].length];
		
		temp[0][0] = 1;
		
		dfs(0,0,maps,temp);
		
		answer = temp[temp.length-1][temp[0].length-1];
		
		System.out.println(answer);
		
		
	}
	
	static void dfs(int i,int j,int[][]maps,int[][]temp) {
		
		int[]di = {1,0,-1,0};
		int[]dj = {0,1,0,-1};
		
		
		for(int d=0;d<4;d++) {
			
			int newI = i + di[d];
			int newJ = j + dj[d];
			
			if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
			
			if(maps[newI][newJ]==1&&temp[newI][newJ]==0) {
				temp[newI][newJ]= temp[i][j]+1;
				temp[i][j] = 1;
				dfs(newI,newJ,maps,temp);
				
			}
			
		}
		
		
		
	}
	
}