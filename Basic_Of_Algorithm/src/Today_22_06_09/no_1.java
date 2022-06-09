package Today_22_06_09;

import java.util.ArrayList;
import java.util.Collections;

public class no_1 {

	static int[]apeach;
	static int[]ryan;
	static boolean[]visited = new boolean[3];
	static char[]op = {'*','+','-'};
	static int max = 0;
	static int N;
	static ArrayList<int[]> answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int n = 5;
		
		N = n;
		apeach = info.clone();
		
		ryan = new int[apeach.length];
		
		dfs(0,0);
		
		int[]answer;
		
		if(answerList.isEmpty()) {
			answer = new int [] {-1};
		}else {
			
			Collections.sort(answerList,(o1,o2)-> {
				
				for(int i=10;i>-1;i--) {
					if(o1[i]!=o2[i]) return o1[i]-o2[i];
				}
				
				return 0;
			});
			
	
			answer = new int[apeach.length];
		
			for(int i=0;i<answer.length;i++)answer[i] = answerList.get(0)[i];
			
		}
		
		for(int i : answer)System.out.print(i+",");
		
	}
	
	
	
	
	static void dfs(int start,int count) {
		
		if(count==N) {
			
			int r = 0;
			int a = 0;
			
			for(int i=0;i<11;i++) {
				if(ryan[i]==0 && apeach[i]==0) continue;
				
				if(ryan[i]>apeach[i]) r += 10-i;
				else a += 10-i;
				
			}
			
			if(r>a) {
				int diff = r - a;
				if(diff>max) {
					max = diff;
					answerList.clear();
					answerList.add(ryan.clone());
				}else if(diff==max) {
					answerList.add(ryan.clone());
				}
			}
			
			
			return;
		}
		
		
		
		for(int i=0;i<11;i++) {
			ryan[i]++;
			dfs(i,count+1);
			ryan[i]--;
			
		}
		
	}
}
