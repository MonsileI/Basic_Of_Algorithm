package Today_22_05_10;

import java.util.Arrays;

public class twoPointer {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,2,3,1};
		int target = 4;
		//2개 뽑아 더해서 4가 되는 경우 {1,3}{2,2}{2,2} 3개 나와야 됨
 		
		Arrays.sort(arr);
		
		for(int i : arr)System.out.print(i+",");
		
		System.out.println();
		
		
		int answer = 0 ;
		
		int start = 0;
		int end = arr.length-1;
		
		
		while(start<=end) {
			
		int sum = arr[start] + arr[end];
		
		if(sum<target) {
			start++;
		}else if(sum>target) {
			end--;
		}else if(sum==target) {
			System.out.println("index : {"+start+" , "+end+"}");
			answer++;
			end--;
			
		}
		
			
			
			
			
		}
		
		System.out.println(answer);
		
		
		
	}

}
