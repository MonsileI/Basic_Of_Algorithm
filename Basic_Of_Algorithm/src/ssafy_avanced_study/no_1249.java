package ssafy_avanced_study;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1249 {
	
	
	

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	
		for(int test_case = 1; test_case <= T; test_case++){
		
			int n = Integer.parseInt(br.readLine());
			
			int [][]map = new int[n+2][2];
			boolean[] check = new boolean[n+2];
			int[]result = new int[n+2];
			
			int min = Integer.MAX_VALUE;
			map[0][0] = Integer.parseInt(br.readLine());
			map[0][1] = Integer.parseInt(br.readLine());
			map[n+1][0] = Integer.parseInt(br.readLine());
			map[n+1][1] = Integer.parseInt(br.readLine());
			
			for(int i=0;i<=n;i++) {
				map[i][0] = Integer.parseInt(br.readLine());
				map[i][1] = Integer.parseInt(br.readLine());
				
			}
			
			
			
			
		}
		
	}
	
}