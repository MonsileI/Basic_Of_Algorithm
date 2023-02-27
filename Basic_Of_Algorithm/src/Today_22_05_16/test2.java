package Today_22_05_16;

import java.util.Queue;
import java.util.LinkedList;

public class test2 {

	public static void main(String[] args) {
		
		
		int [][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		
		Queue<int [] > q = new LinkedList<>();
		
		int [][] temp = new int[map.length][map[0].length];
		
		temp[0][0] = 1;
		
		q.add(new int[] {0,0});
		
		int [][] move = {{0,1},{1,0},{0,-1},{-1,0}};
		
		while(!q.isEmpty()) {
			
			int []c = q.poll();
			
			int ci = c[0];
			int cj = c[1];
			
			for(int d=0;d<4;d++) {
				
				int ni = ci + move[d][0];
				int nj = cj + move[d][1];
				
				if(ni<0||nj<0||map.length-1<ni||map[0].length-1<nj) continue;
				
				if(map[ni][nj]==1 && temp[ni][nj] == 0) {
					temp[ni][nj] = temp[ci][cj] + 1;
					q.add(new int[] {ni,nj});				}
				
				
			}
			
			
			
		}
		
		
		int answer = temp[map.length-1][map[0].length-1];
		
		System.out.println(answer);
		
		
	}
}
