package Today_22_05_26;

import java.util.Scanner;

import java.util.Arrays;

public class backJoon_antenna {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[]arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		int answer = 0;
		
	
		if(n%2==0) {
			int one = 0;
			int two = 0;
			
			for(int i=0;i<arr.length;i++) {
				one += Math.abs(arr[arr.length/2] - arr[i]);
				
			}
			
			System.out.println(arr.length/2);
			for(int i=0;i<arr.length;i++) {
				two += Math.abs(arr[(arr.length/2)-1] - arr[i]);
			}
			
			answer = Math.min(one, two);
			
			
		}else {
			
			for(int i=0;i<arr.length;i++) {
				
				answer += Math.abs(arr[arr.length/2-1] - arr[i]);
			
			}
			
		}
		
		
		System.out.println(answer);
		
	}
}
