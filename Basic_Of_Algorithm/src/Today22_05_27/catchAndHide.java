package Today22_05_27;

import java.util.*;

public class catchAndHide {

	
	public static void main(String[] args) {
		
		
		int n = 17; // +1 +1 +1
		
		int m = 5; //+1 -1 *2
		
		int[]check = new int[100002];
		
		check[m] = 0;
		
		Queue<int[]>q = new LinkedList<>();
		
		
		q.add(new int[] {n,m,0});
		
		
		while(!q.isEmpty()) {
			
			int[]cur = q.poll();
			
			int cn = cur[0];
			int cm = cur[1];
		
			
			if(cn==cm) break;
			
			if(cn>100000) break;
			
			
			if(cm+1<10000 && check[cm+1]==0) {
				check[cm+1] = check[cm] +1;
				q.add(new int[] {cn,cm+1});
			}
			
			if(cm-1>0 && check[cm-1]==0) {
				check[cm-1] = check[cm] +1;
				q.add(new int[] {cn,cm-1});
			}
			
			if(cm*2<10000 && check[cm*2]==0) {
				check[cm*2] = check[cm] +1;
				q.add(new int[] {cn,cm*2});
			}
			
		}
		
		
	System.out.println(check[n]);
		
		
		
		
	}
}
