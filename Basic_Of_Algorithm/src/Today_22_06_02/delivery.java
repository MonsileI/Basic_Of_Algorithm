package Today_22_06_02;

import java.util.Queue;
import java.util.LinkedList;

public class delivery {

	public static void main(String[] args) {
		
	
		int INF = 50001;
		int n = 4;
		
		int[][]road = {{1,2,1},{1,3,5},{2,3,1},{2,4,2}};
		int k = 2;
		int answer = 0;
		
		int [][] map = new int[n+1][n+1];
		
		for(int i = 1 ; i <=n; i++) {
			for(int j=1; j<=n ; j++) {
				if(i==j) continue;
				map[i][j] = INF; //무한대
			}
		}
		
		
		for(int i=0;i<road.length;i++) {
			int a = road[i][0];
			int b = road[i][1];
			int w = road[i][2];
			//무한대 보다 작으면 간선의 정보 저장
			if(map[a][b] > w) {
				map[a][b] = w;
				map[b][a] = w;
			}
			
		}
		
		int [] dist = new int[n+1];
		for(int i = 2; i <= n ; i++) {
			dist[i] = INF;
		}
		
		boolean[] visited = new boolean[n+1];
		visited[1] = true;
		
		
		for(int i=1; i <=n-1 ; i++) {
			
			int min_idx = 1;
			int min_value = INF;
			for(int j=2;j<=n;j++) {
				if(!visited[j] && dist[j]<min_value) {
					min_value = dist[j];
					min_idx = j;
				}
			}
			
			visited[min_idx] = true;
			
			
			for(int j = 2; j <= n ; j++) {
				if(dist[j]>dist[min_idx] + map[min_idx][j]) {
					dist[j] = dist[min_idx] + map[min_idx][j];
				}
			}
			
		}
		
		for(int i=1;i<=n;i++) {
			if(dist[i]<=k) answer++;
		}
		
		for(int i : dist)System.out.print(i+",");
		System.out.println();
		System.out.println(answer);
	}
	
}