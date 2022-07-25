package Today_22_06_02;

public class hanoi {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		int [] arr = {1,2,3};
		
		hanoi(arr[0],arr[1],arr[2],n);
		
		
		//n개를 옮기는 문제는 n-1로 세분화되고 다시 n-1를 위해 1를 옮기는걸 세분화 시킨다
		// a -> b (n-1)개 옮기기
		// b - > c (n-1)개 옮기기
		//n ==1 마지막에 남은거 옮기기
		
	}
	
	static void hanoi(int from, int by, int to,int n) {
		
		if(n==1) {
			System.out.println(from + " - > " + to);
			return;
		}
		
		hanoi(from, to, by, n-1);
		System.out.println(from + " - > " + to);
		hanoi(by,from,to,n-1);
		
	}

}
