package Today_22_05_10;

import java.util.*;

public class test {
	
	public static void main(String[] args) {
		
		int [][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		
		boolean [] visited = new boolean[graph.length];
		
		int start = 1;
		
		visited[start] = true;
	
		String answer = bfs(graph,visited,start);
		
		
		System.out.println(answer);
		
		
	}
	
	static String bfs(int[][]graph,boolean[]visited,int start) {
		
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q= new LinkedList<>();
		
		q.offer(start);
		
		while(!q.isEmpty()) {
			
			int index = q.poll();
			
			sb.append(index + "-> ");
			
			for(int i=0;i<graph[index].length;i++) {
				
				int temp = graph[index][i];
				
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
					
				}
				
			}

		}
		
			
		return sb.toString();
		
		
		
		
	}

}
