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
			int [][] move = {{1,0},{0,1},{-1,0},{0,-1}};
			
			int answer = Integer.MAX_VALUE;
			
			while(!q.isEmpty()) {
				
				int [] cur = q.poll();
				int i = cur[0];
				int j = cur[1];
				
				for(int d=0;d<4;d++) {
					
					int newI = i + move[d][0];
					int newJ = j + move[d][1];
					
					
					if(newI<0||newJ<0||size-1<newI||size-1<newJ) continue;
					

					temp[newI][newJ] = map[newI][newJ] + temp[i][j];
					
					q.add(new int[] {newI,newJ});
					
					if(newI==size-1 && newJ==size-1) {

						answer = Math.min(answer, temp[newI][newJ]);
					}
					
					
					
				}
				
				
				
			}
			
			
			
			System.out.println(answer);
		}
		
		
	}
	
}