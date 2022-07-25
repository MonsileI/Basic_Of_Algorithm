package programmers_level_01;

public class no_3 {
	
	public static void main(String[] args) {
		
		String s = "one4seveneight";
		int answer = 0;
		
		String [] alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		
		for(int i=0;i<alpha.length;i++) s = s.replaceAll(alpha[i], String.valueOf(i));
			
		answer = Integer.valueOf(s);
		
		
		System.out.println(answer);
		
	}

}
