package ssafy_avanced_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1226 {
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		
		int[][]move = {{1,0},{0,1},{-1,0},{0,-1}};
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			
			Integer.parseInt(br.readLine());
			
			int[][]map = new int[16][16];
			
			Queue<int []> q = new LinkedList<>();
			
			
			int []start = new int[2];
			int []end = new int[2];
		
			
			for(int i=0;i<16;i++) {
				String s = br.readLine();
				for(int j=0;j<16;j++) {
					map[i][j] = Integer.parseInt(""+s.charAt(j));
					
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			boolean[][]visited = new boolean[16][16];
		
			
			q.add(new int[] {1,1});
	
			boolean isTrue = false;
			
			while(!q.isEmpty()) {
				
				int [] c = q.poll();
				int i = c[0];
				int j = c[1];
				
	
			
				
		
				
				for(int d=0;d<4;d++) {
				
					int ni = i+move[d][0];
					int nj = j+move[d][1];
					
					if(ni<0||nj<0||15<ni||15<nj) continue;
					
					if(map[ni][nj]==3) {
						isTrue = true;
						break;
					}
					
					if(!visited[ni][nj] && map[ni][nj]==0) {
						visited[ni][nj] = true;
						q.add(new int[] {ni,nj});
						
						
					}
					
				}
				
			}
			
			sb.append("#").append(test_case).append(" ");
			
			if(isTrue) sb.append(1);
			else sb.append(0);
			
			System.out.println(sb.toString());
			
		}
		
	}
	
}