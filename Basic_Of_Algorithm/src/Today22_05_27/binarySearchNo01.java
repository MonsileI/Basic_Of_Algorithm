package Today22_05_27;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchNo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++)arr[i] = scan.nextInt();
        
        int m = scan.nextInt();
      
        int[]find = new int[m];
        
        
        for(int i=0;i<m;i++)find[i] = scan.nextInt();
		
		int [] answer = new int[find.length];
		
		
		
		Arrays.sort(arr);
		
		for(int i=0;i<find.length;i++) {
			
			int num = find[i];
			
			answer[i] = binary(num,arr);
			
			if(answer[i]>1) answer[i] = 1;
			
		}
		
		for(int i : answer)System.out.println(i);
		
		
	}
	
	static int binary(int num,int[] arr) {
		
		
		int start = 0;
		int end = arr.length-1;
		int count = 0;
		
		while(start<=end) {
			
			int mid = (start+end) / 2;
			
			if(num>=arr[mid]) start = mid+1;
			else if(start==end)break;
			else if(num<arr[mid]) end = mid - 1;
			
			if(arr[mid]==num) count++;
			
			
		}
		
		
		
		return count;
		
		
		
	}
}
