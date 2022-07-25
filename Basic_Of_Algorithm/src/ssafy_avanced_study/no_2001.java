package ssafy_avanced_study;

import java.util.Scanner;

public class no_2001 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [][]map = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int ans = 0;
		int max = 0;
		
		for(int i=0;i<=n-k;i++) {
			for(int j=0;j<=n-k;j++) {
				
				for(int ii=0;ii<k;ii++) {
					for(int jj=0;jj<k;jj++) {
						ans += map[ii+i][jj+j];
					}
				}
				
				max = Math.max(ans, max);
				ans = 0;
			}
		}
		String answer = "#"+test_case+" "+max;
		System.out.println(answer);
		
		}
	}
}
