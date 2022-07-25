package Today_22_05_26;

import java.util.Arrays;

public class backJoon_number_card2 {
	
	public static void main(String[] args) {
		
		int [] arr1 = {6,3,2,10,10,10,-10,7,3};
		int [] arr2 = {10,9,-5,2,3,4,5,-10};
		
		int []answer = new int[arr2.length];
		
		
		Arrays.sort(arr1);
		
		
		for(int i=0;i<arr2.length;i++) {
			
			answer[i] = upperBound(arr2[i],arr1) - lowerBound(arr2[i],arr1);
		}
		
		
		for(int i : answer)System.out.println(i);
		
		
	}
	static int lowerBound(int num,int []arr) {
		
		
		int start = 0;
		int end = arr.length;
		
		
		while(start<end) {
			
			int mid = (start+end)/2;
			
			if(arr[mid]>=num) {
				end = mid;
			}else {
				start = mid+1;
			}
			
		}
		
		return start;
	}
	static int upperBound(int num,int []arr) {
		
		
		int start = 0;
		int end = arr.length;
		
		
		while(start<end) {
			
			int mid = (start+end)/2;
			
			if(arr[mid]>num) {
				end = mid;
			}else {
				start = mid+1;
			}
			
		}
		
		return start;
	}

}
