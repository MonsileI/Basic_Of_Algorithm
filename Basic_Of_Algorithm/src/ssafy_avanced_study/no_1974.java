package ssafy_avanced_study;

import java.util.Scanner;

public class no_1974 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
		
			int[][]map = new int[9][9];
			
			boolean flag = true;
			String answer = "#"+test_case+" ";
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			outerLoop:
			for(int i=0;i<9;i++) {
				int []arr = new int[9];
				int []arr2 = new int[9];
				for(int j=0;j<9;j++) {
					arr[map[i][j]-1]++;
					arr2[map[j][i]-1]++;
					
					if(arr[map[i][j]-1]>1 || arr2[map[i][j]-1]>1) {
						flag = false;
						break outerLoop;
					}
					
					
					}
					
				}
			outerLoop:
			for(int l=0;l<3;l++) {
				
				int[]arr = new int[9];

				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						arr[map[i+(l*3)][j+(l*3)]-1]++;
						if(arr[map[i][j]-1]>1) {
							flag = false;
							break outerLoop;
						}
						
					}
				}
			}
			
			
			if(!flag) answer += 0 ;
			else answer += 1;
			
			System.out.println(answer);
			
			
			
		}
	}
}