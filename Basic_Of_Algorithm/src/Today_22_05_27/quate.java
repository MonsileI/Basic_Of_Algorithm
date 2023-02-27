package Today_22_05_27;

public class quate {

	static int [] answer = new int[2];

	public static void main(String[] args) {
		
		
		int [][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		
		
		
		dfs(arr,arr.length,0,0);
		
		
		System.out.println(answer[0]+" : "+answer[1]);
		
	}
	
	static boolean check(int[][]arr,int size,int x, int y) {
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(arr[i][j]!=arr[x][y]) return false;
			}
		}
		
		
		
		return true;
		
		
	}
	
	static void dfs(int[][]arr,int size,int x, int y) {
		
		
		if(check(arr,size,x,y)) {
			
			answer[arr[x][y]]++;
			
			return;
		}
		
		
		dfs(arr,size/2,x,y);
		dfs(arr,size/2,x,y+size/2);
		dfs(arr,size/2,x+size/2,y+size/2);
		dfs(arr,size/2,x+size/2,y);
		
		
		
	}
}
