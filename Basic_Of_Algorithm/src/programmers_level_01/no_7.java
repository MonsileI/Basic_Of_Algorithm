package programmers_level_01;

public class no_7 {
	
	public static void main(String[] args) {
		
		
		String dartResult = "1S2D*3T";
		
		int answer = 0;
		
		//숫자가 나오면 넣어주면 되겠네
		
		int[]temp = new int[3];
		
		int idx = -1;
		
		for(int i=0;i<dartResult.length();i++) {
			
			String str = ""+dartResult.charAt(i);
			
			if(str.equals("1")&&i<dartResult.length()-1) {
				if(dartResult.charAt(i+1)=='0') {
					str = "10";
				}
			}
			
			if(str.equals("0") && i!=0) {
				if(dartResult.charAt(i-1)=='1') continue;
			}
			
			
			switch (str) {
			case "S": temp[idx] =(int)Math.pow(temp[idx], 1);
				
				break;
			case "D": temp[idx] =(int)Math.pow(temp[idx], 2);
				
				break;
			case "T": temp[idx] =(int)Math.pow(temp[idx], 3);
				
				break;
			case "*": if(idx!=0)  temp[idx-1] *= 2;
			 		  temp[idx] *= 2;
				break;
			case "#":  temp[idx] *= -1;
				
				break;
			
			default: idx++;
					 temp[idx] = Integer.valueOf(str);
					 
				break;
			}
			
			
			
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(temp[i]);
			answer += temp[i];
		}
		
		System.out.println(answer);		
	}

}
