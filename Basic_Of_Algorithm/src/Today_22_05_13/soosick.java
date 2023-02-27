package Today_22_05_13;

import java.util.ArrayList;

public class soosick {
	
	static boolean [] visited = new boolean[3];
	static char[] sick = {'+','-','*'};
	static long answer = 0;
	static ArrayList<Character> opArr = new ArrayList<>();
	static ArrayList<Long> numArr = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		String expression = "100-200*300-500+20";
		
		input(expression);
		
		dfs(new char[3],0);
		
		System.out.println(answer);
		
		
		
	}
	
	static Long change(char ch,long a, long b) {
		if(ch=='+') return a+b;
		else if(ch=='-') return a-b;
		else if(ch=='*') return a*b;
		else return (long) 0;
		
	}
	

	static void dfs(char[]p,int count) {
		
		if(count==3) {

			ArrayList<Long>numList =new ArrayList<>(numArr);
			ArrayList<Character>opList =new ArrayList<>(opArr);
			
			for(int i=0;i<p.length;i++) {
				for(int j=0;j<opList.size();j++) {
					if(p[i]==opList.get(j)) {
						long a = change(opList.get(j),numList.remove(j),numList.remove(j));
						opList.remove(j);
						numList.add(j,a);
						j--;
					}
				}
			}

				answer = Math.max(answer, Math.abs(numList.get(0)));
				
				return;
			
		}
		
			
		for(int i=0;i<sick.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				p[count] = sick[i];
				dfs(p,count+1);
				visited[i] = false;
			}
			
		}
		
		
	}
	
	static void input(String expression) {
		
		String num="";
		
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch>='0'&& ch<='9') num += ch;
			else {
				numArr.add(Long.parseLong(num));
				opArr.add(ch);
				num="";
			}
			
			
			
		}
		
		numArr.add(Long.parseLong(num));
		
		
	}
	

}
