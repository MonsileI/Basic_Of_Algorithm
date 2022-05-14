package Today_22_05_13;

import java.util.Queue;
import java.util.LinkedList;

public class hideAndFind {
	
	public static void main(String[] args) {
		
		int hider = 17;
		int finder = 5;
		
		
		Queue<Integer> q = new LinkedList<>();
		
		int[]check = new int[100001];
		
		check[finder] = 0;
		
		q.add(finder);
		
		while(!q.isEmpty()) {
			
			int pos = q.poll();
			
			if(check[hider]!=0 || pos>100000) break;
			
			if(pos-1 >= 0 && check[pos-1] ==0 ) {
				check[pos-1] = check[pos] + 1;
				q.add(pos-1);
			}
			if(pos+1 < check.length && check[pos-1] ==0 ) {
				check[pos+1] = check[pos] + 1;
				q.add(pos+1);
			}
			if(pos*2 >= 0 && check[pos*2] ==0 ) {
				check[pos*2] = check[pos] + 1;
				q.add(pos*2);
			}
			
		}
		
		
		System.out.println(check[hider]);
		
	}

}
