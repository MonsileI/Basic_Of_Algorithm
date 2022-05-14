package Today_22_05_13;

import java.util.Stack;

public class testCode {
	
	public static void main(String[] args) {
		
		int n = 43674;
		int k = 3;
		int answer = 0;
		
		String num = "";
		
		while(n>0) {
			
			num = n%k + num;
			n /= k;
			
		}
		
		System.out.println(num);
		
	}
}
