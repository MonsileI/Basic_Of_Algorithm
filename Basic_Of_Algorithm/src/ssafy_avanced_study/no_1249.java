package ssafy_avanced_study;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1249 {
	
	static int answer = Integer.MAX_VALUE;
	

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	
		for(int test_case = 1; test_case <= T; test_case++){
		
			int size =Integer.parseInt(br.readLine());
			
			int[][]map = new int[size][size];
			
			Queue<int []> q = new LinkedList<>();
			
			q.add(new int[] {0,0});
			
			for(int i=0;i<size;i++) {
					String str =br.readLine();
				for(int j=0;j<size;j++) {
					map[i][j] = Integer.parseInt(""+str.charAt(j));
				}
			}
			
		
			
			
			int[][]temp = new int[size][size];
			temp[0][0] = 0;
		
			
		
			
			dfs(0,0,temp,map,size);
			
			System.out.println(answer);
			
		}
		
		
	}
	static void dfs(int i,int j,int[][]temp,int[][]map,int size) {
		
		
		if(map[i][j]>=answer) return;
		
		int [][] move = {{1,0},{0,1},{-1,0},{0,-1}};
		
		
		if(i==size-1 && j ==size-1) {
			answer = Math.min(answer, temp[size-1][size-1]);
			return;
		}
		
		for(int d=0;d<4;d++) {
			
			int newI = i + move[d][0];
			int newJ = j + move[d][1];
			
			if(newI<0||newJ<0||size-1<newI||size-1<newJ) continue;
			
			
			if(temp[newI][newJ]==0) {
				temp[newI][newJ] = temp[i][j] + map[newI][newJ];
				dfs(newI,newJ,temp,map,size);
				temp[newI][newJ] = 0;
			}
			
			
		}
	}
	
}