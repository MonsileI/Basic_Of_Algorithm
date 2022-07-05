package interestingAlgorithm;

public class dfs {
	
	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		
		boolean[]visited = new boolean[arr.length];
		
		dfs(arr,0,"",visited);
		
		
	}
	
	static void dfs(int[]arr,int count,String now,boolean[]visited) {
		
		if(count==arr.length) {
			System.out.println(now);
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + arr[i];
				dfs(arr,count+1,newOne,visited);
				visited[i] = false;
			}
		}
		
		
		
		
	}
	

}
