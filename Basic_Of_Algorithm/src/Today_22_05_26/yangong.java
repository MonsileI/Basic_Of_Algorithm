package Today_22_05_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class yangong {

	
	static int[] answer;
	static int[] apeach;
	static int[] ryan;
	static boolean[] visited;
	static int count;
	static int max = Integer.MIN_VALUE;
	static ArrayList<int[]>answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int n = 5;
		apeach = info.clone();
		ryan = new int[apeach.length];
		visited = new boolean[apeach.length];
		count = n;
		
		answer = solution(n,info);
		
		for(int i=0;i<answer.length;i++) System.out.print(answer[i]+" ,");
	
		
		
	
	}
	
	static void dfs(int s,int L) {
		
		if(L==count) {
			
			int r = 0;
			int a = 0;
			
			for(int i=0;i<apeach.length;i++) {
				if(ryan[i]==0 && apeach[i] == 0) continue;
				
				if(ryan[i]>apeach[i]) r += 10 - i;
				else a += 10 - i;
			}
			
			
			if(r>a) {
				int diff = r-a;
				if(max<diff) {
					max = diff;
					answerList.clear();
					answerList.add(ryan.clone());
				}else if(max==diff) answerList.add(ryan.clone());
				
			}
			
			return;
		}
		
		
		for(int i=s;i<apeach.length;i++) {
			ryan[i]++;
			dfs(i, L+1);
			ryan[i]--;
		}
	}
	
	
	static int[] solution(int n, int[] info) {
		 
		 
		
		dfs(0,0);
		 
		 
		Collections.sort(answerList,(o1,o2)->{
			for(int i=10;i>-1;i--) {
				if(o1[i]!=o2[i]) return o2[i] - o1[i];
			}
			return 0;
		});
		
		
		if(answerList.isEmpty()) return new int[] {-1};
		
			answer = new int[info.length];
			
			for(int i=0;i<info.length;i++) answer[i] = answerList.get(0)[i];
			
			return answer;
			
			
		
		
		 
	 }
	
}
