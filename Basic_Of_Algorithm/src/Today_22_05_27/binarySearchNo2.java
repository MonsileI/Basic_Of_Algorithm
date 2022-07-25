package Today_22_05_27;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearchNo2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = scan.nextInt();

		Arrays.sort(arr);
		
		int m = scan.nextInt();
		
		int [] find = new int[m];
		
		for(int i=0;i<m;i++) find[i] = scan.nextInt();
		
		int []answer = new int[m];
		
		for(int i=0;i<find.length;i++) {
			
			int num = find[i];
			
			answer[i] = upperSearch(num, arr)-lowerSearch(num,arr);
			
		}
		
		for(int i : answer)System.out.println(i);
	}
	
		static int upperSearch(int num, int []arr) {
			
			int start = 0;
			int end = arr.length-1;
		
			
			while(start<=end) {
				
				
				
				int mid = (start+end)/2;
				

				
				if(num>=arr[mid]) start = mid+1;
				else end = mid-1;
				
			}
			
			return start;
			
		}
		
		static int lowerSearch(int num, int []arr) {
			
			int start = 0;
			int end = arr.length-1;
	
			while(start<=end) {
				
				

				int mid = (start+end)/2;
				

				
				if(num>arr[mid]) start = mid+1;
				else end = mid-1;
				
				
				
				
			}
			
			return start;
			
		}
}
