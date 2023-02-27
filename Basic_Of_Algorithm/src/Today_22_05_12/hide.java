package Today_22_05_12;

import java.util.*;

public class hide {
	
	public static void main(String[] args) {
		
		
		int sb = 5;
		int bro = 17;
		
		
		
		Queue<Integer> q = new LinkedList<>();
		
		int[] position = new int[100001];
		
		
		position[sb] = 0;
		
		q.add(sb);
		
		while(!q.isEmpty()) {
			
			
			int p = q.poll();
			
			if(position[bro]!=0) break;
			
			if(position[p-1] ==0 && p-1>=0) {
				position[p-1] = position[p] + 1;
				q.add(p-1);
			}
			
			if(position[p+1] ==0 && p+1<=position.length) {
				position[p+1] = position[p] + 1;
				q.add(p+1);
				
			}	
			if(position[p*2] ==0 && p*2<=position.length) {
				position[p*2] = position[p] + 1;
				q.add(p*2);
				
			}	
			
			
		}
		
		if(sb==bro) position[bro] = 0;
		System.out.println(position[bro] + " 초");
		
		
		
	}

}
