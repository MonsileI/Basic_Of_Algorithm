package Today_22_05_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class backJoon_greedy_no1 {

	static int answer = -1;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		
		
		String str = String.valueOf(n);
		
		boolean[]visited = new boolean[str.length()];
		
		
		dfs(visited,str,"",0);
		
		System.out.println(String.valueOf(answer));
		
	}
	
	static boolean check(String now) {
		
		int a = Integer.parseInt(now);
		
		if(a%30==0) return true;
		else return false;
		
		
		
	}
	
	static void dfs(boolean[]visited,String str,String now,int count) {
		
		
		if(count==str.length()) {
			if(check(now)) {
				answer = Math.max(answer, Integer.parseInt(now));
			}
			return;
		}
		
			for(int i=0;i<str.length();i++) {
				if(!visited[i]) {
					visited[i] = true;
					String next = now + str.charAt(i);
					dfs(visited,str,next,count+1);
					visited[i] = false;
				}
			}
		
	}
	

		
	
}
