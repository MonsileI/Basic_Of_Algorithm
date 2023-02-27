package Today_22_06_08;

import java.util.Queue;
import java.util.LinkedList;

public class gameMapQueue {

	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int[][]move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		int answer = 0;
		
		int[][]temp = new int[maps.length][maps.length];
		
		temp[0][0] = 1;
		
		Queue<int []> q = new LinkedList<>();
		
		q.add(new int[] {0,0});
		
		while(!q.isEmpty()) {
			
			int[]cur = q.poll();
			
			int i = cur[0];
			int j = cur[1];
			
			for(int d=0;d<4;d++) {
				
				int newI = move[d][0] + i;
				int newJ = move[d][1] + j;
				
				if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
				
				if(temp[newI][newJ]==0 && maps[newI][newJ]==1) {
					temp[newI][newJ] = temp[i][j] +1;
					q.add(new int[] {newI,newJ});
					
				}
				
			}
		}
		
		answer = temp[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
		
	}
}
