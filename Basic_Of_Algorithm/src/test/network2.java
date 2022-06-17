package test;

import java.util.*;

public class network2 {
	
	public static void main(String[] args) {
		
		int n = 3;
		
		int[][]computers = {{1,1,0},{1,1,0},{0,0,1}};
		
		int answer = 0;
		
		boolean[]visited = new boolean[computers.length];
		
		for(int i=0;i<computers.length;i++) {
			if(!visited[i]) {
				dfs(i,visited,computers);
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	static void dfs(int node,boolean[]visited,int[][]computers) {
		
		visited[node] = true;
		
		for(int i=0;i<computers.length;i++) {
			
			if(!visited[i] && computers[node][i]==1) {
				dfs(i,visited,computers);
			}
			
		}
		
	}
}
