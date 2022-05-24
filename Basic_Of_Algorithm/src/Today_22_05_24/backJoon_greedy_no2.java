package Today_22_05_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class backJoon_greedy_no2 {

	

	public static void main(String[] args) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int t = Integer.parseInt(br.readLine());
	
	//25 10 5 1
	
	for(int i=0;i<t;i++) {
		
		int money = Integer.parseInt(br.readLine());
		
		int a =0, b=0, c=0, d = 0;
		
		while(true) {
			
			if(money>=25) {
				money -= 25;
				a++;
			}
			else if(money>=10) {
				money -= 10;
				b++;
			}
			else if(money>=5) {
				money -=5;
				c++;
			}
			else {
				money -= 1;
				d++;
			
			}
			
			if(money<=0) break;
			
		}
		
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
		
		
		
		
	}
	
}
