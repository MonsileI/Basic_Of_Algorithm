package Today_22_05_27;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearchNo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int n = scan.nextInt();
		
		int[]arr = new int[k];
		
		for(int i =0;i<k;i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		
		long max = arr[arr.length-1]+1;
		
		long min = 0;
		long mid = 0;
		
	
		while(min<max) {
			
			
			mid = (max+min)/2;
			
			long count = 0;
			
			for(int i=0;i<arr.length;i++) {
				
				count += (arr[i]/mid);
			}
			
			
			if(count<n) {
				max = mid;
			}else {
				min = mid+1;
				
			}
			
			
			
			
			
		}
		
		
		
		
		System.out.println(min - 1);
	}
	

}
