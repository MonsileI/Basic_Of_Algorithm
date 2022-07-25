package Today_22_05_11;

public class combi_dfs {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		
		boolean[] visited = new boolean[arr.length];
		
		 combi(arr,visited,0,2);
		 
		 dfs(arr,visited,"");
		
		
	}
	static void combi(int[]arr,boolean[]visited,int start,int r) {
		
		if(r==0) {
			for(int i=0;i<arr.length;i++) {
				if(visited[i]) System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=start;i<arr.length;i++) {
			
			visited[i] = true;
			combi(arr,visited,i+1,r-1);
			visited[i] = false;
			
		}
	}
	
	static void dfs(int[]arr,boolean[]visited,String print) {
		
		System.out.println(print);
		
		if(print.length()==arr.length)return;
		
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = print + arr[i];
				dfs(arr,visited,newOne);
				visited[i] = false;
			}
		}
		
	}
	
}
