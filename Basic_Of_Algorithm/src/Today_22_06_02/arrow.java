package Today_22_06_02;

import java.util.ArrayList;
import java.util.Collections;

public class arrow {

	static int apeach[];
	static int ryan[];
	static int count;
	static int maxvalue = 0;
	static ArrayList<int[]> answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[]info = {0,0,1,2,0,1,1,1,1,1,1};
		int n = 9;
		
		apeach = info.clone();
		count = n;
		ryan = new int[info.length];
		
		dfs(0,0);
		
		int [] answer;
		
		if(answerList.isEmpty()) answer = new int[] {-1};
		
		else {
			
			Collections.sort(answerList,(o1,o2)->{
				
				for(int i=10;i>-1;i--) {
					if(o1[i]!=o2[i]) return o2[i] - o1[i];
				}
				
				return 0;
				
			});
			
			answer = new int[apeach.length];
			
			for(int i=0;i<apeach.length;i++) answer[i] = answerList.get(0)[i];
			
			
			for(int i : answer)System.out.print(i+", ");
		}
		
		
		
		
		
	}
	static void dfs(int start, int arrow) {
		
		if(arrow==count) {
			
			int r = 0;
			int a = 0;
			
			for(int i=0;i<11;i++) {
				if(ryan[i]==0 && apeach[i]==0) continue;
				
				if(ryan[i]>apeach[i]) r += 10 - i;
				else a += 10 - i;
			}
			
			if(r>a) {
				int diff = r - a;
				if(diff>maxvalue) {
					maxvalue = diff;
					answerList.clear();
					answerList.add(ryan.clone());
					
				}else if(diff==maxvalue) {
					answerList.add(ryan.clone());
				}
			}
			
			return;
		}
				
		
		for(int i=0;i<11;i++) {
			ryan[i]++;
			dfs(i,arrow+1);
			ryan[i]--;
		}
		
	}
}
