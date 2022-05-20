package Today_22_05_20;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class room {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		
		int[][]arr = new int[n][2];
		
		int answer = 0 ;
		
		for(int i=0;i<n;i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return o1[0] - o2[0];
				else return o1[1] - o2[1];
			}
		});
		
		int end_time = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(end_time<=arr[i][0]) {
				end_time = arr[i][1];
				answer++;
			}
			
			
		}
		System.out.println(answer);
		
	}

}
