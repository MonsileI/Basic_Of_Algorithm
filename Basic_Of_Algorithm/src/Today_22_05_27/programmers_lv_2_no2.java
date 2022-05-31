package Today_22_05_27;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class programmers_lv_2_no2 {


	
	public static void main(String[] args) {
		
		
		int [] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		int answer = 0;
		
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		
		for(int i : scoville) q.offer(i);
		
		
		while(k>q.peek()) {
			
			if(q.size()<2)break;
			
			
			int first = q.poll();
			int second = q.poll();
			
			int newOne = first + (second*2);
			
			q.offer(newOne);
			answer++;
			
			
		}
		
		
		System.out.println(answer);
		
		
		
	}
	
	
	
	
}
