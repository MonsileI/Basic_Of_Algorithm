package interestingAlgorithm;

import java.util.Arrays;

public class arrTest {

	public static void main(String[] args) {
		
		
		int[]arr = {1,2,3,4,5};
		
		int[]scores;
		
		scores = arr;
		
		scores[0] = 1320;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(scores));
		
		
		//주소값을 복사하는 shallow copy는 copy한 영역을 조정해도 원래값도 바뀜 ㅠ
	}
	
}
