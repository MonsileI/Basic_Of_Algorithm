package Today_22_05_10;

public class combination {
	
	public static void main(String[] args) {
		

		int[]arr = {1,2,3};
		
		boolean[]visited = new boolean[arr.length];
		
		CombinationClass combi = new CombinationClass();
		
		
		for(int i=1;i<=arr.length;i++) {
			
			combi.combi(arr,i,visited,0);
		}
		
	}

}

 class CombinationClass{
	
		
	 void combi(int[]arr,int goal,boolean[]visited,int start) {
		 
		 
		 if(goal==0) {
			 print(arr,visited);
			 return;
		 }
		 
		 for(int i=start;i<arr.length;i++) {
			 if(!visited[i]) {
				 visited[i] = true;
				 combi(arr,goal-1,visited,i+1);
				 visited[i] = false;
			 }
		 }
		 
		 
		 
	 }
	
		
		
	
	
	 void print(int[]arr,boolean [] visited) {
		 
		int check = 0 ;
		String now = "";
		 for(int i=0;i<arr.length;i++) {
			 if(visited[i]) {
				 now += arr[i] + " ";
				 check++;
			 }
			 
		 }
		 
		 if(check>2) {
			 System.out.println("3개 조합");
			 System.out.println(now);
		 }else if(check>1) {
			 System.out.println("2개 조합");
			 System.out.println(now);
		 }else {
			 System.out.println("1개 조합");
			 System.out.println(now);
		 }
		 
		 
		 
	 }
	
	
	
}
