package sw_java_im;

public class no_3 {
	
	static int answer = 0 ;
	static int t;
	public static void main(String[] args) {
		
		
		int [] arr = {1,1,1,1,1};
		int target = 3;
		t = target;
		
		dfs(arr,0,0);
		
		System.out.println(answer);
	}
	
	static void dfs(int[]arr,int now,int count) {
		
		if(count==arr.length) {
			if(now==t) answer++;
			
			return;
		}
		
		dfs(arr,now+arr[count],count+1);
		dfs(arr,now-arr[count],count+1);
		
		
		
		
	}

}
