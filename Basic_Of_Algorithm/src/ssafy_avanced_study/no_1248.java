package ssafy_avanced_study;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class no_1248 {
	
	
	

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	
		for(int test_case = 1; test_case <= T; test_case++){
		
			int size =Integer.parseInt(br.readLine());
			
			int[][]map = new int[size][size];
			
			int answer = Integer.MAX_VALUE;
		
			
			for(int i=0;i<size;i++) {
				String s = br.readLine();
				for(int j=0;j<size;j++) {
					map[i][j] = Integer.parseInt(""+s.charAt(j));
				}
			}
			
			Queue<int[]> q = new LinkedList<>();
			
			int[][]mov = {{1,0},{0,1},{-1,0},{0,-1}};
			int[][]temp = new int[size][size];
			boolean[][]visited = new boolean[size][size];
			q.add(new int[] {0,0});
			
			while(!q.isEmpty()) {
				
				int []c = q.poll();
				int i = c[0];
				int j = c[1];

				if(i==size-1 && j==size-1) {
					answer = Math.min(answer, temp[i][j]);
					continue;
				}
				if(answer<=temp[i][j]) continue;
			
				for(int d=0;d<4;d++) {
					int ni = i + mov[d][0];
					int nj = j + mov[d][1];
					
					if(ni<0 || nj<0|| size-1 <ni|| size-1 < nj) continue;
					
					if(!visited[ni][nj] || temp[ni][nj] > temp[i][j] + map[ni][nj]) {
						visited[ni][nj] = true;
						temp[ni][nj]  = temp[i][j] + map[ni][nj];
						q.add(new int[] {ni,nj});	
					}
						
				}
				
			}
			
			System.out.println("#"+test_case+" "+answer);
			
			
			
		}
		
	}
	
}