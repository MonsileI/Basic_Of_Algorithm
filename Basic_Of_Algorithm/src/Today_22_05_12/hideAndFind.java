package Today_22_05_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class hideAndFind {

	public static void main(String[] args) {
	
		int[][]jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		int answer = 0;
		
		Arrays.sort(jobs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		
		});
		
		
		for(int i=0;i<jobs.length;i++) {
			System.out.println(jobs[i][0]+" : "+jobs[i][1]);
		}
		
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]-o2[1];
			}
		
		});
		
		q.offer(jobs[0]);
		int end = jobs[0][0];
		int sum = 0;
		int idx = 1;
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			end += cur[1];
			sum += end - cur[0];
			System.out.println(sum);
			
			while(idx < jobs.length && jobs[idx][0] <= end) {
				q.offer(jobs[idx++]);
			}
			
			if(idx < jobs.length && q.isEmpty()) {
				end = jobs[idx][0];
				q.offer(jobs[idx++]);
			}
		}
		
		
		System.out.println(sum/jobs.length);
	}
}