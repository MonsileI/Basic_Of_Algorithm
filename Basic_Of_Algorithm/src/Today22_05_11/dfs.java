package Today22_05_11;

public class dfs {
	
	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		int[][]temp = new int[maps.length][maps[0].length];
		
		temp[0][0] = 1;
		
		long start = System.nanoTime();
		
		dfs(maps,temp,0,0);
		
		answer = temp[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
		
		long end = System.nanoTime();
		
		System.out.println("걸린 시간 : " + (end-start)+" 나노초"); //10억분의 1초 반환
		
	}
	
	static void dfs(int[][]maps,int[][]temp,int i,int j) {
		
		int[]id = {1,0,-1,0};
		int[]jd = {0,1,0,-1};
		
		
		for(int d=0;d<4;d++) {
			
			int newI = i + id[d];
			int newJ = j + jd[d];
			
			if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
			
			if(maps[newI][newJ]==1&&temp[newI][newJ]==0) {
				
				temp[newI][newJ] = temp[i][j] +1;
				temp[i][j] = 1;
				dfs(maps,temp,newI,newJ);
				
			}
			
		}
		
		
	}

}
