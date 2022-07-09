package ssafy_avanced_study;

import java.util.Scanner;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class no_1249 {
	
	static int answer = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	
		for(int test_case = 1; test_case <= T; test_case++){
		
			int size =Integer.parseInt(br.readLine());
			
			int[][]map = new int[size][size];
			
			for(int i=0;i<size;i++) {
				
				String str = br.readLine();
				
				for(int j=0;j<size;j++) {
					map[i][j] = Integer.parseInt(""+str.charAt(j));
					
				}
				
				
			}
		
			
			int[][]move = {{1,0},{0,1},{-1,0},{0,-1}};
			
			boolean[][]visited = new boolean[size][size];
		
			dfs(size,0,0,move,map,visited,0);
			
			System.out.println(answer);
			
			answer = Integer.MAX_VALUE;
			
		}
		
	
	}
	
	static void dfs(int size,int i,int j,int[][]move,int[][]map,boolean[][]visited,int now) {
		
		if(i>size-2 && j>size-2) {
			
			answer = Math.min(answer, now);
			return;
		}
		
		for(int d=0;d<4;d++) {
			
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||size-1<newI||size-1<newJ) continue;
			
			if(!visited[newI][newJ]) {
				visited[newI][newJ] = true;
				int newOne = now + map[newI][newJ];
				dfs(size,newI,newJ,move,map,visited,newOne);
				visited[newI][newJ] = false;
			}
			
		}
		
		
		
		
	}
}