package interestingAlgorithm;

import java.util.Scanner;

public class Collatz_Graph {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		while(n!=1) {
			
			if(n%2==0) n /=2;
			else n = (n*3) + 1;
			
			for(int i =0;i<n;i++) {
				System.out.print("0");
			}
			
			System.out.println();
			
			
		}
	
		
		
	}
}
