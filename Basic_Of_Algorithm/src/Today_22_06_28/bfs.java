package Today_22_06_28;

import java.util.Queue;
import java.util.LinkedList;

public class bfs {

	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int [][] temp = new int[maps.length][maps[0].length];
		
		int answer;
		
		temp[0][0] = 1;
		
		Queue<int[]> bfs = new LinkedList<>();
		
		bfs.add(new int[] {0,0});
		
		int [][]move = {{1,0},{0,1},{-1,0},{0,-1}};
		
		while(!bfs.isEmpty()) {
			
			int[]cur = bfs.poll();
			
			int i = cur[0];
			int j = cur[1];
			
			for(int d=0;d<4;d++) {
				int newI = i + move[d][0];
				int newJ = j + move[d][1];
				
				if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
				
				if(maps[newI][newJ]==1 && temp[newI][newJ] ==0) {
					temp[newI][newJ] = temp[i][j] + 1;
					bfs.add(new int[] {newI,newJ});
				}
				
			}
			
			
		}
		
		answer = temp[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
	}
}
