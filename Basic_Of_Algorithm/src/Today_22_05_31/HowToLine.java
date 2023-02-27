package Today_22_05_31;

public class HowToLine {

	static int check;
	static String answer = "";
	public static void main(String[] args) {
		
		
		int n = 3;
		int k = 5;
		
		check = k;
		
		int[]arr = new int[n];
		
		int num = 1;
		
		for(int i=0;i<n;i++)arr[i] = num++;
		
		boolean[]visited = new boolean[n];
		
		dfs(arr,visited,0,"");
		
		int[]result = new int[n];
		
		for(int i=0;i<result.length;i++) {
			result[i] = Integer.parseInt(""+answer.charAt(i));
		}
		
		
		for(int i : result)System.out.print(i+",");
	}
	
	static void dfs(int[]arr,boolean[]visited,int count,String now) {
		
		if(count==arr.length) {
			
			check--;
			
			if(check==0) {
				answer = now;
				return;
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String next = now + arr[i];
				dfs(arr,visited,count+1,next);
				visited[i] = false;
			}
		}
	}
}
