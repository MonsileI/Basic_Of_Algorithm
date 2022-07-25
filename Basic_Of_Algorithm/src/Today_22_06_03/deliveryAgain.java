package Today_22_06_03;

public class deliveryAgain {

	public static void main(String[] args) {
		
		
		int n = 3;
		
		int [][]road = {{1,2,1},{1,3,5},{2,3,1}};
		
		int k = 2;
		
		int answer = 0;
		
		int [][] map = new int[n+1][n+1];
		
		int INF = 500001;
		
		for(int i=1;i<map.length;i++) {
			for(int j = 1 ; j < map[0].length;j++) {
				if(i==j)continue;
				map[i][j] = INF;
			}
		}
	
		for(int i = 0 ; i < road.length;i++) {
			int a = road[i][0];
			int b = road[i][1];
			int value = road[i][2];
			
			if(map[a][b] > value) {
				map[a][b] = value;
				map[b][a] = value;
			}
		}
		
		
		int[]dist = new int[n+1];
		
		for(int i=2 ; i<dist.length;i++) {
			dist[i] = INF;
		}
		
		boolean[] visited=  new boolean[n+1];
		
		visited[1] = true;
		
		
		for(int i = 1 ; i < n ; i ++) {
			
			
			
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
		
		for(int i = 1 ; i <dist.length;i++) {
			if(dist[i]<=k)answer++;
		}
		
		
		System.out.println(answer);
		
		for(int i : dist)System.out.print(i+",");
	}
}
