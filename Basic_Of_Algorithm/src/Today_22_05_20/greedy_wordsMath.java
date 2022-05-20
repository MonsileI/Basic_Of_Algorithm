package Today_22_05_20;

import java.util.Scanner;

public class greedy_wordsMath {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[]arr = new int[n];
		
		for(int i=0;i<arr.length;i++) arr[i] = scan.nextInt();
		
		int answer = 0;
		
		int nPoint = arr[arr.length-1];
		
		
		
		for(int i=arr.length-2;i>-1;i--) {
			
			int pre = arr[i];
			while(nPoint<=pre) {
				
				answer++;
				pre--;
				
			}
			
			nPoint = pre;
			
			
		}
		
		
		System.out.println(answer);
		
	}
}
