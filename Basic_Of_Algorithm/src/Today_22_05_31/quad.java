package Today_22_05_31;

public class quad {

	
	public static void main(String[] args) {
		
		solution solution = new solution();
		
		int[][]arr1 = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[][]arr2 = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		int[]result1 = solution.solution(arr1);
		int[]result2 = solution.solution(arr2);
		
		System.out.print(result1[0]+" , ");
		System.out.println(result1[1]);
		System.out.print(result2[0]+" , ");
		System.out.println(result2[1]);
		
	}
}

class solution{
	

	int[]answer;
	
	public int[]solution(int[][]arr) {
		
		answer= new int[2];
		
		
		
		change(arr,0,0,arr.length);
		
		
		
		
		
		
		return answer;
	}
	
	boolean check(int[][]arr,int x,int y,int size) {
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(arr[x][y]!=arr[i][j]) return false;
			}
		}
		
		return true;
	}
	
	void change(int[][]arr,int x,int y,int size) {
		
		
		if(check(arr,x,y,size)) {
			answer[arr[x][y]] += 1;
			return;
		}
		
		
		change(arr,x,y,size/2);
		change(arr,x,y+size/2,size/2);
		change(arr,x+size/2,y,size/2);
		change(arr,x+size/2,y+size/2,size/2);
		
	}
	
}
