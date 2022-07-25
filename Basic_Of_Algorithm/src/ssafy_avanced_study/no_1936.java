package ssafy_avanced_study;

import java.util.Scanner;

public class no_1936 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
        int b = scan.nextInt();
        
        String.valueOf(a);
        
        String answer = "";
       
        if(a==1){
            if(b==2) answer = "B";
            else answer = "A";
        }else if(a==2){
            if(b==3) answer = "B";
            else answer = "A";
        }else{
            if(b==1) answer = "B";
            else answer = "A";
        }
		/////////////////////////////////////////////////////////////////////////////////////////////
		/*
			 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
		 */
		/////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println(answer);
		
	}
}
