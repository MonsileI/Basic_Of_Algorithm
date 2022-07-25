package Today_22_05_20;

import java.util.Scanner;

public class greedy_bracket {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String temp = scan.next();
		
		String[]str = temp.split("\\-");
		
		int answer = 0;
		
		for(int i=0;i<str.length;i++) {
			
			String[]subStr = str[i].split("\\+");
			
			int calc = 0;
			for(String item : subStr) {
				calc += Integer.parseInt(item);
			}
			
			if(i==0) {
				answer += calc;
				
			}else {
				answer -= calc;
			}
		}
	
		
		System.out.println(answer);
		
	}

}
