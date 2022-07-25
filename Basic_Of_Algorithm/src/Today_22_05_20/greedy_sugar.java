package Today_22_05_20;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class greedy_sugar {
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//3 //5
		int answer = 0;
		
		//5의 배수도 3의 배수도 아닌 경우에도 나눠 떨어지는 애들이 있음!
		
		
		while(true) {
			
			if(n%5==0) {
				answer += n/5;
				break;
			}else {
				answer ++;
				n -= 3;
			}
			
			if(n<0) {
				answer = -1;
				break;
			}
			
		}
		
		System.out.println(answer);
		
	}

}
