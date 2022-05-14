package Today_22_05_11;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {

	
	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		int[][]temp = new int[maps.length][maps[0].length];
		
		temp[0][0] = 1;
		
		long start = System.nanoTime();
		
		bfs(maps,temp);
		
		answer = temp[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
		
		long end = System.nanoTime();
		
		System.out.println("걸린 시간 : " + (end-start)+" 나노초"); //10억분의 1초 반환
		
		
	}
	
	static void bfs(int[][]maps,int[][]temp) {
		
		Queue<int[] > q = new LinkedList<>();
		
		q.add(new int[] {0,0});

		int []id = {1,0,-1,0};
		int []jd = {0,1,0,-1};
		
		while(!q.isEmpty()) {
			
			int [] currentCount = q.poll();
			
			int ci = currentCount[0];
			int cj = currentCount[1];
			
			for(int d=0;d<4;d++) {
				
				int ni = ci+id[d];
				int nj = cj+jd[d];
				
				if(ni<0||nj<0||maps.length-1<ni||maps[0].length-1<nj) continue;
				
				if(maps[ni][nj]==1&&temp[ni][nj]==0) {
					temp[ni][nj] = temp[ci][cj] +1;
					q.add(new int[] {ni,nj});
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
