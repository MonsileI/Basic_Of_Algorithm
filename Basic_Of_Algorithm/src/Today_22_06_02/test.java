package Today_22_06_02;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
	
		int n = 3;
		int [][]road = {{1,2,1},{1,3,5},{2,3,1}};
		int k = 2;
		int answer = 0;
		
		int INF = 50001;
		
		int[][]map = new int[n+1][n+1];
		
		for(int i =0;i<map.length;i++) Arrays.fill(map[i], INF);
		
		for(int i=0;i<road.length;i++) {
			int start = road[i][0];
			int end = road[i][1];
			int value = road[i][2];
			
			if(map[start][end] >value) {
				map[start][end] = value;
				map[end][start] = value;
			}
			
		}
		
		
		int[]dist = new int[n+1];
		
		boolean[]visited = new boolean[n+1];
		
		visited[1] = true;
		
		for(int i = 2 ;i<=n;i++) {
			 dist[i] = (dist[i]==0) ? INF : map[1][i];
		}
		
		for(int i : dist) System.out.print(i+",");
		
		System.out.println();
		
		for(int i=1;i<n;i++) {
			
			int min_value = INF;
			int min_idx = 1;
			
			for(int j=2;j<=n;j++) {
				
				if(!visited[j] && dist[j] < min_value) {
					
					min_value = dist[j];
					min_idx = j;
				}
				
			}
			
			visited[min_idx] = true;
			
			for(int j=2;j<=n;j++) {
				
				if(dist[j] > dist[min_idx] + map[min_idx][j]) {
					dist[j] = dist[min_idx] + map[min_idx][j];
				}
				
			}
			
			
			
		}
		
		for(int i=1;i<=n;i++) {
			if(dist[i]<=k)answer++;
		}
	
		
		System.out.println(answer);

		for(int i : dist)System.out.print(i+",");
		System.out.println();
		for(boolean a : visited)System.out.print(a+",");
		System.out.println();
		
	}
	

}
