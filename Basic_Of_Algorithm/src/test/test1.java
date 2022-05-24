package test;

import java.util.Queue;
import java.util.LinkedList;

public class test1 {
	
	static int move[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	

	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int[][]temp = new int[maps.length][maps[0].length];
		
		int answer = 0;
		
		temp[0][0] = 1;
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {0,0});
		
		int[][]move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		while(!q.isEmpty()) {
			
			int[]cur = q.poll();
			
			int i = cur[0];
			int j = cur[1];
			
			
			
			for(int d=0;d<4;d++) {
				
				int newI = i + move[d][0];
				int newJ = j + move[d][1];
				
				
				if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ)continue;
				
				
				if(maps[newI][newJ]==1 && temp[newI][newJ] == 0) {
					
					temp[newI][newJ] = temp[i][j] + 1;
					q.add(new int[] {newI,newJ});
					
				}
				
			}
	
		}
		
		
		answer = temp[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
	}
	
}