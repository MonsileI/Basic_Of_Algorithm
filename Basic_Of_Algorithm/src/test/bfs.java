package test;

import java.util.Queue;
import java.util.LinkedList;

public class bfs {

	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
	
		int[][]temp = new int[maps.length][maps[0].length];
		
		temp[0][0] = 1;
		
		Queue<int[]> q = new LinkedList<>();
		
		int [][] move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		q.add(new int[]{0,0});
		
		while(!q.isEmpty()) {
			
			int [] cur = q.poll();
			
			int cI = cur[0];
			int cJ = cur[1];
			
			for(int d=0;d<4;d++) {
				
				int newI = cI + move[d][0];
				int newJ = cJ + move[d][1];
				
				
				if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
				
				if(temp[newI][newJ]==0 && maps[newI][newJ]==1) {
					q.add(new int[] {newI,newJ});
					temp[newI][newJ] = temp[cI][cJ]+1;
				}
				
				
			}
			
		}
		
		
		answer = temp[maps.length-1][temp[0].length-1];
		
		System.out.println(answer);
	}
}
