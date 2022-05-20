package Today_22_05_20;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class greedy_coin2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int answer = 0;

		Integer[]arr = new Integer[n];
		
		
		for(int i=0;i<n;i++) arr[i] = scan.nextInt();
		
		for(int i=arr.length-1;i>-1;i--) {
			
			if(arr[i]<=k) {
				answer += k/arr[i];
				k = k%arr[i];
			}
			
		}
		
		System.out.println(answer);
	}

}
