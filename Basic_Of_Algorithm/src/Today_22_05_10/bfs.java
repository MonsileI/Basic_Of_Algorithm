package Today_22_05_10;

import java.util.*;

public class bfs {

	public static void main(String[] args) {
			
		//index랑 맞추려고 첫번째꺼는 비워놓을거임
		int [][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

		boolean[] visited = new boolean[graph.length];
		
		int start = 1;
		
		System.out.println(bfs(start,graph,visited));

		
		
	}
	static String bfs(int start,int[][]graph,boolean[]visited) {
		
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			
			for(int i=0;i<graph[nodeIndex].length;i++) {
				int temp = graph[nodeIndex][i];
				
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		
		return sb.toString();
	}
	
}
