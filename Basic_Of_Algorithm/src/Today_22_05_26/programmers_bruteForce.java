package Today_22_05_26;

import java.util.*;

public class programmers_bruteForce {

	static int answer = 0;
	static Set<Integer>set = new HashSet<>();

	
	public static void main(String[] args) {
		
	
		String numbers = "17";
		
		
		
		boolean[]visited = new boolean[numbers.length()];
		
		dfs(numbers,visited,"");
		
		System.out.println(set.size());
		System.out.println(set);
		
	}
	
	static void dfs(String numbers,boolean [] visited,String now) {
		
		if(!now.isEmpty()) {
			
			
			int temp = Integer.parseInt(now);
			boolean flag = true;
			
			if(temp==2) flag = true;
			else if(temp==1 || temp==0) flag = false;
			
			
			for(int i=2;i<=Math.sqrt(temp);i++) {
				
				if(temp%i==0) {
					flag = false;
					break;
				}
				
			}
			
			if(flag) set.add(temp);
		}
		
		
		
		
		for(int i = 0 ; i<numbers.length();i++) {
			
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + numbers.charAt(i);
				dfs(numbers,visited,newOne);
				visited[i] = false;
			}
			
			
		}
		
		
		
	}

}
