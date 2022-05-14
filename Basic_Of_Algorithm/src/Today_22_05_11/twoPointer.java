package Today_22_05_11;

import java.util.Arrays;

public class twoPointer {

	
	public static void main(String[] args) {
		
		
		int []arr = {1,2,2,3,3,4,5};
		int target = 4;
		//두개 합쳐서 4가 나오는 경우
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length-1;
		int answer = 0;
		
		while(start<=end) {
			
			int sum = arr[start] + arr[end];
			
			if(sum>target) end--;
			else if(sum==target) {
				System.out.println(start+","+end);
				answer++;
				start++;
				end--;
			}else if(sum<target) {
				start++;
			}
			
			
			
			
		}
		
		System.out.println("답: "+ answer);
		
		System.out.println();
		
		start = 0;
		end = arr.length-1;
		answer = 0;
				
		
		while(true) {
			
			if(start==end) break;
			
			
			int sum = arr[start] + arr[end];
			
			//=일때 end--해주고 어차피 밑에서 같은 값이면 answer++해주니까 두번 쓰지 말자 이거지..
			//물론 세번으로 나눠도 크게 상관 없을듯. 가독성에 더 좋을지도
			//아무튼, 인덱스 값만 조절, 같은지 다른지는 밑에서 파별 후 answer++ 
			if(sum>=target) end--;
			else if(sum<target) start++;
			
			
			if(sum==target) {
				System.out.println(start+","+end);
				answer++;
			}
			
			
			
		}
		
		System.out.println("답: "+ answer);
		
		
	}
}
