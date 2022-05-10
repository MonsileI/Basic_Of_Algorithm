package Today_22_05_10;

public class dfs {
	
	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		
		boolean[]visited = new boolean[arr.length];
		
		dfsClass dfsclass = new dfsClass();
		
		dfsclass.dfs(arr,visited,"",arr.length);
		
	}

}
class dfsClass{
	
		//dfs를 위한 메소드
		 void dfs(int[]arr,boolean[]visited,String now,int count){
			
			print(now);
			
			if(count==0) return;
			
			for(int i=0;i<arr.length;i++) {
				if(!visited[i]) {
					visited[i] = true;
					String newOne = now + arr[i];
					dfs(arr,visited,newOne,count-1);
					visited[i] = false;
				}
			}
			
			
		}
		
		//출력을 위한 메소드
		 void print(String now) {
			System.out.println(now);
		}
		
		
	
}
