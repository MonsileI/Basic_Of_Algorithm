package test;

public class combination_Algorithm {

public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		boolean[]visited = new boolean[arr.length];
		
		combi(arr,visited);
		
		dfs(arr,visited,"");
	
		
	}
	

	
	static void dfs(int[]arr,boolean[]visited,String now) {
		
		System.out.println(now);
		
		if(now.length()==arr.length) return;
		
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + arr[i];
				dfs(arr,visited,newOne);
				visited[i] = false;
				
			}
			
		}
		
	}
	
	static void combi(int[]arr,boolean[]visited) {
		
		
		for(int i=1 ; i<=arr.length;i++) {
			
			System.out.println(arr.length+"중에 " + i + "개 뽑기");
			
			combination(arr,visited,i,0);
			
			System.out.println();
		}
		
		
		
	}
	static void combination(int[]arr,boolean[]visited,int r, int start) {
		
		if(r==0) {
			print(visited,arr);
			return;
		}
		
		for(int i=start;i<arr.length;i++) {
			visited[i] = true;
			combination(arr,visited,r-1,i+1);
			visited[i] = false;
		}
		
		
	}
	static void print(boolean[]visited,int[]arr) {
		String printNow = "";
		for(int i=0;i<arr.length;i++) {
			
			if(visited[i]) printNow += arr[i];
		}
		System.out.println(printNow);
	}

}
