package interestingAlgorithm;

public class collatz_conjecture {

	public static void main(String[] args) {
		
		int n = 6;
		int answer = 0;
		
		while(true) {
			
			if(n%2==0) n /= 2;
			else n = (n*3) + 1;
			
			answer++;
			
			System.out.println(n);
		}
		
	}
}
