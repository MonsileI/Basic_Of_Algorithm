package Today_22_05_11;

import java.util.Arrays;

public class twoPointerRangeSum {
	
	public static void main(String[] args) {
		
		int [] arr = {2,1,1};
		int target = 2;
		//구간 합이 3이 되는 애들 (답 3나와야됨)
		
		Arrays.sort(arr);
		
		int l = 0;
		int r = 0;
		int sum = 0;
		int answer = 0;
		
		while(true) {
	
			//인덱스에서 뽑아낸 애들보다 원래 값이 뒤에 온다고 생각해야됨
			if(sum>=target) sum -= arr[l++];
			else if(r==arr.length) break;
			else if(sum<target) sum += arr[r++];
			
			if(sum==target) answer++;
			
			
		}
		
	
		
		System.out.println(answer);
		
		
	}

}
