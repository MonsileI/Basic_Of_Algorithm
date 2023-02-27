package Today_22_05_27;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchNo4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		int m = scan.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		long min = 0;
		long max = arr[arr.length-1] + 1;
		long total = 0;
		
		while(min<max) {
			
			
			long mid = (min+max)/2;
			
			long temp = 0;
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]- mid > 0) {
					temp += (arr[i]-mid);
				}
			}
			
			
			if(temp<m) {
				max = mid;
			}else {
				min = mid+1;
			}
			
			
			
			
			
			
		}
		
		
		
		System.out.println(min-1);
		
		
		
	}

}
