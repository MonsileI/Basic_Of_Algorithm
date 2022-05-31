package Today_22_05_31;

import java.util.ArrayList;
import java.util.Collections;

public class Yangong {

	static int[]ryan;
	static int[]apeach;
	static int arrow;
	static ArrayList<int[]> answerList = new ArrayList<>();
	static int maxValue = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		
	int n = 10;
	int[]info = {0,0,0,0,0,0,0,0,3,4,3};
	
	apeach = info.clone();
	ryan = new int[apeach.length];
		

	arrow = n;
		
	dfs(0,0);
	
	
	if(answerList.isEmpty()) answerList.add(new int[] {-1});
	else {
		
		Collections.sort(answerList,(o1,o2)-> {
			
			for(int i=o1.length-1;i>-1;i--) {
				if(o1[i]!=o2[i]) return o2[i] - o1[i];
			}
			
			return 0;
		
		});
		
		
	}
		
	for(int i : answerList.get(0)) System.out.print(i+",");
		
	}
	
	static void dfs(int start,int goal) {
		
		if(goal==arrow) {
			int r = 0;
			int a = 0;
			
			for(int i=0;i<apeach.length;i++) {
				
				if(apeach[i]==0 && ryan[i]==0)continue;
				
				if(apeach[i]>=ryan[i]) a += 10 - i;
				else r += 10-i;
				
			}
			
			if(r>a) {
				int diff = r-a;
				if(maxValue<diff) {
					maxValue = diff;
					answerList.clear();
					answerList.add(ryan.clone());
				}else if(maxValue==diff) {
					answerList.add(ryan.clone());
				}
			}
			
		}else {
			
			for(int i=0;i<apeach.length;i++) {
				ryan[i]++;
				dfs(i,goal+1);
				ryan[i]--;
			}
			
		}
		
		
	}
}
