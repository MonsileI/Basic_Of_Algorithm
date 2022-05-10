package Today_22_05_10;

import java.util.Arrays;

public class twoPointerRangeSum {

	public static void main(String[] args) {
		
		
		int[]arr = {1,1,2,4};
	
		//조합 뽑아내서 8이 되는 경우의 수
		
		
		int target = 4;
		
		int answer = 0;
		
		int l = 0;
		int r = 0;
		int sum = 0;
		
		while(true) {
			
			if(sum>target) sum -= arr[l++];
			else if(sum==target) {
				System.out.println(sum+","+l+","+r);
				answer++;
				sum -=arr[l++];
			}else if(sum<target) {
				sum += arr[r++];
			}
		
			if(l==arr.length&&r==arr.length)break;
			
			
		}
		
		
		System.out.println(answer);
		
		
	}
	
}
