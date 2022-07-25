package Today_22_05_20;

import java.util.Scanner;

public class greddy_changeMoney {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cash = scan.nextInt();
		
		//500 100 50 10 5 1
		
		int[]arr = {500,100,50,10,5,1};
		
		cash = 1000-cash;
		
		int answer = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(cash>=arr[i]) {
			
				answer += cash/arr[i];
				cash = cash%arr[i];
			}
			if(cash==0)break;
		}
		
		
		System.out.println(answer);
		
		
	}

}
