package Today22_05_27;

public class programmers_lv_2_no1 {

	static int[]answer;
	static int[]num = new int[2];
	
	public static void main(String[] args) {
		
		
		int[][]arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		
		answer = new int[2];
		
		
		change(0,0,arr, arr.length);
				
		
				
		answer = num.clone();
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
	
	static void change(int x,int y,int[][]arr,int size) {
		
		
		if(check(x,y,arr,size)) {
			num[arr[x][y]]++;
			return;
		}
		
		
		
		change(x, y,arr,size/2);
		change(x+size/2, y,arr,size/2);
		change(x, y+size/2,arr,size/2);
		change(x+size/2, y+size/2,arr,size/2);
		
		
	}
	
	static boolean check(int x,int y,int[][]arr,int size) {
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(arr[i][j]!=arr[x][y]) return false;
			}
		}
		
		
		
		return true;
		
	}
	
	
	
	
}
