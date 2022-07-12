package ssafy_avanced_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1226 {
	
	static int answer = 0;
	static int [][] move = {{1,0},{0,1},{-1,0},{0,-1}};
	
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
			
			int []start = new int[2];
			int []end = new int[2];
			
			for(int i=0;i<16;i++) {
					String str =br.readLine();
				for(int j=0;j<16;j++) {
					map[i][j] = Integer.parseInt(""+str.charAt(j));
					if(map[i][j]==2) {
						start[0] = i;
						start[1] = j;
					}else if(map[i][j]==3) {
						end[0] = i;
						end[1] = j;
					}
				}
			}
			
			
			
			int[][]temp = new int[16][16];
			temp[start[0]][start[1]] = 0;
			
			
			dfs(start[0],start[1],temp,end,map);
			
			
			
		}
		
		
	}
	static void dfs(int i,int j,int[][]temp,int[]end,int[][]map) {
		
		
		if(i==end[0] && j==end[1]) {
			answer = 1;
			return;
		}
		
		for(int d=0;d<4;d++) {
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||temp.length-1<newI||temp[0].length-1<newJ) continue;
			
			if(temp[newI][newJ]==0 && map[newI][newJ]==0) {
				temp[newI][newJ] = temp[i][j] + 1;
				dfs(newI, newJ, temp, end, map);
				temp[newI][newJ] = 0;
			}
		}
		
		
		
	}
	
}