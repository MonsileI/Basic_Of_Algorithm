package Today_22_05_16;

import java.util.LinkedList;
import java.util.Queue;

public class test {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 17;
		
		int[]visited = new int[10001];
		
		
		Queue<Integer> q = new LinkedList<>();
		
		visited[a] = 0;
		
		q.add(a);
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			
			if(visited[b]!=0 || now >=10000) break;
			
			if(now-1>=0 && visited[now-1] ==0) {
				visited[now-1] = visited[now] + 1;
				q.add(now-1);
			}
			
			if(now+1<=10000 && visited[now+1] ==0) {
				visited[now+1] = visited[now] + 1;
				q.add(now+1);
			}
			
			if(now*2<=10000 && visited[now*2] ==0) {
				visited[now*2] = visited[now] + 1;
				q.add(now*2);
			}
			
		}
		
		
		
		System.out.println(visited[b]);
		
	}
	
}
