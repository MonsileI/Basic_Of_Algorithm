package Today_22_05_26;

import java.util.*;

public class twoPointer {

	public static void main(String[] args) {
		
		int [] two = {1,1,2,2,3,3};
					//1,1,2,2,3,5,7
		int target = 4;
		int answer = 0;
		//답 = 2
		int start = 0;
		int end = two.length-1;
		Arrays.sort(two);
		
		
		
		while(start<=end) {
			
			
			int sum = two[start] + two[end];
			
			if(sum<target) start++;
			else if(start==end) break;
			else end--;
			
			
			if(target==sum)answer++;
			
			
			
		}
		
		
		System.out.println(answer);
		
			
			
		
		
		
		
		
	}
	
}
