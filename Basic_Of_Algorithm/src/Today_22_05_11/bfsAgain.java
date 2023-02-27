package Today_22_05_11;

import java.util.LinkedList;
import java.util.Queue;

public class bfsAgain {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		String [] saem = {"SOOOX","OXXOX","OXOOX","OXOXX","EOOXX"};
		
		char[][]maps = new char[saem.length][saem[0].length()];

		int[] start = {};
		
		for(int i=0;i<saem.length;i++) {
			for(int j=0;j<saem[0].length();j++) {
				maps[i][j] = saem[i].charAt(j);
				if(maps[i][j]=='S') start = new int[] {i,j};
			}
		}
		
		int [][]temp = new int[maps.length][maps[0].length];
		
		temp[start[0]][start[1]] = 0;
		
		
		Queue<int[]>q = new LinkedList<>();
		
		q.offer(new int[] {start[0],start[1]});
		
		int [] di = {1,0,-1,0};
		int [] dj = {0,1,0,-1};
		
		outerLoop:
		while(!q.isEmpty()) {
			
			int []cur = q.poll();
			
			int ci = cur[0];
			int cj = cur[1];
			
			for(int d=0;d<4;d++) {
				int ni = ci + di[d];
				int nj = cj + dj[d];
				if(ni<0||nj<0||maps.length-1<ni||maps[0].length-1<nj) continue;
				if(maps[ni][nj]=='E') {
					temp[ni][nj] = temp[ci][cj]+1;
					answer = temp[ni][nj] ;
					break outerLoop;
				}
				if(maps[ni][nj]=='O'&&temp[ni][nj]==0) {
					temp[ni][nj] = temp[ci][cj]+1;
					q.offer(new int[] {ni,nj});
				}
				
				
			}
		
		}
		
		System.out.println(answer);
		
	}
	
}