package Today_22_05_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class backJoon_greedy_no4 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		Integer []crain = new Integer[n];
		
		for(int i=0;i<n;i++) crain[i] = Integer.parseInt(s.split(" ")[i]);	
		
		Arrays.sort(crain, Collections.reverseOrder());
		
		int m = Integer.parseInt(br.readLine());
		
		String s2 = br.readLine();
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<m;i++) q.add(Integer.parseInt(s2.split(" ")[i]));
		
		if(q.peek()>crain[0]) answer = -1;
		else {
			
			while(!q.isEmpty()) {
				
				answer++;
				
				for(int i=0;i<crain.length;i++) {
					
					if(!q.isEmpty() && crain[i] >= q.peek()) q.poll();
					if(q.isEmpty()) break;
					
				}
				
				if(q.isEmpty()) break;
				
			}
		}
		
		
		System.out.println(answer);
		
	
	}
	
}
