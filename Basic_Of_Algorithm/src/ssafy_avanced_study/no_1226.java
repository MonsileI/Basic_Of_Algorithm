package ssafy_avanced_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1226 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T= Integer.parseInt(br.readLine());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int[][]map = new int[16][16];
			
			Queue<int []> q = new LinkedList<>();
			
			q.add(new int[] {0,0});
			
			for(int i=0;i<16;i++) {
					String str =br.readLine();
				for(int j=0;j<16;j++) {
					map[i][j] = Integer.parseInt(""+str.charAt(j));
				}
			}
			
			int[][]temp = new int[16][16];
			temp[0][0] = 0;
			int [][] move = {{1,0},{0,1},{-1,0},{0,-1}};
			
			int answer = Integer.MAX_VALUE;
			int answerI = 0;
			int answerJ = 0;
			
			for(int i=0;i<16;i++) {
				for(int j=0;j<16;j++) {
					if(map[i][j]==2) {
						temp[i][j] = 0;
						q.add(new int[] {i,j});
					}else if(map[i][j]==3) {
						answerI = i;
						answerJ = j;
					}
					
				}
			}
			
			System.out.println(q.poll()[0]);
			System.out.println(q.poll()[1]);
			
			while(!q.isEmpty()) {
				
				int [] cur = q.poll();
				int i = cur[0];
				int j = cur[1];
				
				for(int d=0;d<4;d++) {
					
					int newI = i + move[d][0];
					int newJ = j + move[d][1];
					
					
					if(newI<0||newJ<0||15<newI||15<newJ) continue;
					
					if(map[newI][newJ]==0 && temp[newI][newJ]==0) {
						temp[newI][newJ] = temp[i][j] + 1;
						q.add(new int[] {newI,newJ});
					}
					
					
					
					
				}
				
				
				
			}
			
			if(temp[answerI][answerJ] !=0) answer = 1;
			else answer = 0;
			
			System.out.println(answer);
		}
		
		
	}
	
}