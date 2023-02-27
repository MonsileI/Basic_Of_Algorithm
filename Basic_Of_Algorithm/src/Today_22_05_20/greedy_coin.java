package Today_22_05_20;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class greedy_coin {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int answer = 0;

		Integer[]arr = new Integer[n];
		
		
		for(int i=0;i<n;i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			
			int coin = arr[i];
			
			
			while(k>=coin) {
				System.out.println(coin);
				answer++;
				k -= coin;
			}
			
			
		}
		
		System.out.println(answer);
		
	}

}
