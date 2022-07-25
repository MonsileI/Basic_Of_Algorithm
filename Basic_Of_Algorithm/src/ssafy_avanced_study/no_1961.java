package ssafy_avanced_study;

import java.util.Scanner;

public class no_1961 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++){
		
			
			
			String answer = "#"+test_case;
			
			int size = sc.nextInt();
			
			int[][]map = new int[size][size];
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			System.out.println(answer);
			
			int[][]map1 = new int[size][size];
			
			for(int j=0;j<size;j++) {
				for(int i=size-1;i>-1;i--) {
					map1[j][size-i-1] = map[i][j];
				}
				
			}
			
			int[][]map2 = new int[size][size];
			
			
			for(int i=size-1;i>-1;i--) {
				for(int j=size-1;j>-1;j--) {
					map2[size-i-1][size-j-1] = map[i][j];
				}
				
			}
			
			int[][]map3 = new int[size][size];
			
			for(int j=size-1;j>-1;j--) {
				for(int i=0;i<size;i++) {
					map3[size-j-1][i] = map[i][j];
				}
				
			}
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.print(map1[i][j]);
					
				}
				System.out.print(" ");
				for(int j=0;j<size;j++) {
					System.out.print(map2[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<size;j++) {
					System.out.print(map3[i][j]);
				}
				System.out.println();
			}
			
			
		}
	}
}