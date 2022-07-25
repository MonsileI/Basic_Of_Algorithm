package Today_22_05_24;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class programmer_lv_2_no_2 {
	
	public static void main(String[] args) {
		
		int [] progresses = {95, 90, 99, 99, 80, 99};
		
		int [] speeds = {1, 1, 1, 1, 1, 1};
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<progresses.length;i++) {
			
			int temp = 0;
			

			
			while(progresses[i]<100) {
				progresses[i] += speeds[i];
				temp++;
			}
			
			q.add(temp);
			
		}
		
		
		ArrayList<Integer> answerList = new ArrayList<>();
		
		while(!q.isEmpty()) {
			
			int a = q.poll();
			
			int answerInt = 1;
			
			while(!q.isEmpty() && a>= q.peek()) {
				
				answerInt++;
				q.poll();
			}
			
			answerList.add(answerInt);
			
		}
		
		System.out.println(answerList);
		
		
	}

}
