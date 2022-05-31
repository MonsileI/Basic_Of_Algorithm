package Today_22_05_31;

public class targetNumber {
	
	static int answer= 0;
	static int tar;
	public static void main(String[] args) {
		
		int[]numbers = {1,1,1,1,1};
		int target = 3;
		tar = target;
		dfs(numbers,0,0);
		
		System.out.println(answer);
		
	}
	
	static void dfs(int[]numbers,int now,int count) {
		
		if(count==numbers.length) {
			
			if(tar==now) answer++;
			
			
			return;
		}
		
		
		dfs(numbers,now + numbers[count],count+1);
		dfs(numbers,now - numbers[count],count+1);
		
		
		
	}

}
