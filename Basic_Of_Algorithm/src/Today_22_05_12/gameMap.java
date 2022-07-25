package Today_22_05_12;

import java.util.*;

public class gameMap {

	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		Queue<int[]> q = new LinkedList<>();
		
		
		int[][]temp = new int[maps.length][maps[0].length];
		
		int [][] move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		
		temp[0][0] = 1;
		
		q.add(new int[] {0,0});
		
		while(!q.isEmpty()) {
			
			int[]cur = q.poll();
			
			int i = cur[0];
			int j = cur[1];
			
			for(int d=0;d<4;d++) {
				
				int ni = i + move[d][0]; 
				int nj = j + move[d][1];
				
				if(ni<0||nj<0||maps.length-1<ni||maps[0].length-1<nj) continue;
				
				if(maps[ni][nj]==1&&temp[ni][nj]==0) {
					temp[ni][nj] = temp[i][j] + 1;
					q.add(new int[] {ni,nj});
				}
				
			}
			
		}
		
		System.out.println(temp[maps.length-1][maps[0].length-1]);
		
		
	}
}
