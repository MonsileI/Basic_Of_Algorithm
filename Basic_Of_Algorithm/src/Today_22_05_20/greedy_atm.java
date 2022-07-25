package Today_22_05_20;

import java.util.Scanner;
import java.util.Arrays;

public class greedy_atm {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int answer = 0;
	
	int n = scan.nextInt();
	
	int[]man = new int[n];
	
	for(int i=0;i<n;i++) man[i] = scan.nextInt();
	
	Arrays.sort(man);
	int temp = 0;
	for(int i=0;i<man.length;i++) {
		temp += man[i];
		answer += temp;
	}
	
	System.out.println(answer);
		
		
		
	}

}
