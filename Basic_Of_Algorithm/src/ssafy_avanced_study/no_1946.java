package ssafy_avanced_study;

import java.util.Scanner;

public class no_1946 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
           
		
			int n = sc.nextInt();
			
			
			
			String answer = "";
            
			sc.nextLine();

			for(int i=0;i<n;i++) {
				
				
				String str = sc.nextLine();
				char alpha = str.charAt(0);
				int count = 0;
			
				if(str.charAt(2)=='1' && str.length()>3) {
					count = Integer.parseInt(""+str.charAt(2)+str.charAt(3));
				}else if(str.charAt(2)=='2' && str.length()>3) {
					count = Integer.parseInt(""+str.charAt(2)+str.charAt(3));
				}
				else count = Integer.parseInt(String.valueOf(str.charAt(2)));
				
				for(int j=0;j<count;j++) answer += alpha;
				
				
				
			}

			System.out.println("#"+test_case);
			String a = "";
			for(int i=1;i<=answer.length();i++) {
				a += answer.charAt(i-1);
				if(i%10==0) {
					System.out.println(a);
					a = "";
				}
			}
			System.out.println(a);
			
			

		}
	}
}