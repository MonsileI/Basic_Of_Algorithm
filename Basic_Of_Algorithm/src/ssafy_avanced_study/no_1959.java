package ssafy_avanced_study;

import java.util.Scanner;

public class no_1959 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();
		
		for(int test_case=1;test_case<=T;test_case++) {
			
			String answer = "#"+test_case+" ";
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			int []arr1 = new int[a];
			int []arr2 = new int[b];
			
			for(int i=0;i<a;i++) arr1[i] = sc.nextInt();
			for(int i=0;i<b;i++) arr2[i] = sc.nextInt();
			
			int max = 0;
			
			if(a<=b) {
				
				int c = b-a;
				
				for(int i=0;i<=c;i++) {
					
					for(int j=0;j<arr1.length;j++) ans += arr1[j] * arr2[j+i];
						
					System.out.println(ans);
					
					max = Math.max(max, ans);					
					ans = 0;
				}
				
				
			}else {
				
				int c = a-b;
				
				for(int i=0;i<=c;i++) {
					
					for(int j=0;j<arr2.length;j++) ans += arr2[j] * arr1[j+i];
					
				
					
					max = Math.max(max, ans);
					ans = 0;
				}
				
				
			}
			
			
			answer += max;
			
			System.out.println(answer);
			
		}
		
		
		
	}
}
